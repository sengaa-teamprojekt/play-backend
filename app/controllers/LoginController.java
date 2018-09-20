package controllers;

import models.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.*;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.List;

import static play.libs.Scala.asScala;

@Singleton
public class LoginController extends Controller {

    private final Form<UserData> form;
    private final List<User> dummyUser;

    @Inject
    public LoginController(FormFactory formFactory) {
        this.form = formFactory.form(UserData.class);
        this.dummyUser = com.google.common.collect.Lists.newArrayList(
                new User("User 1", "pw123"),
                new User("User 2", "pw123"),
                new User("User 3", "pw123")
        );
    }

    public Result index() {
        return ok(views.html.index.render());
    }

    public Result listUsers() {
        return ok(views.html.listUsers.render(asScala(dummyUser), form));
    }

    public Result createUser() {
        final Form<UserData> boundForm = form.bindFromRequest();

        if (boundForm.hasErrors()) {
            play.Logger.ALogger logger = play.Logger.of(getClass());
            logger.error("errors = {}", boundForm.errors());
            return badRequest(views.html.listUsers.render(asScala(dummyUser), boundForm));
        } else {
            UserData data = boundForm.get();
            dummyUser.add(new User(data.getEmail(), data.getPassword()));
            flash("info", "User added!");
            return redirect(routes.LoginController.listUsers());
        }
    }
}
