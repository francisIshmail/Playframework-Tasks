package controllers;

import model.Task;
import play.*;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Results;
import views.html.*;

public class Application extends Controller {


    public Result tasks() {

        Form<Task> taskForm = Form.form(Task.class) ;

        return ok( views.html.index.render(Task.all(),taskForm ));
    }

    public Result newTask() {
        return Results.TODO;
    }

    public Result deleteTask(long id) {
        return Results.TODO;
    }

    public Result index() {
        return redirect(routes.Application.tasks());
    }


}
