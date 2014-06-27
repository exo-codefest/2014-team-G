package org.exoplatform.juzu.task;

import juzu.Path;
import juzu.View;
import juzu.Response;
import juzu.template.Template;

import javax.inject.Inject;
import java.io.IOException;

/**
 * Created by nagui on 27/06/14.
 */
public class TaskController {

    @Inject
    @Path("index.gtmpl")
    Template index;

    @View
    public Response.Content index() throws IOException {
        return index.ok();
    }
}
