package com.maoxiaoxiong.version.two.web.servlet;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 *
 * @author wangzhixiong
 * @description
 * @projectName spring-boot-version
 * @pakageName com.maoxiaoxiong.version.version.two.web.servlet
 * @date 2019/10/27 8:11 PM
 * @ClassName ServletClass
 */

@WebServlet(urlPatterns = "/my/servlet",
        asyncSupported = true
)
public class ServletClass extends HttpServlet {
    public static void main(String[] args) {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        AsyncContext async = req.startAsync();

        async.start(() -> {
            try {
                resp.getWriter().println("hello servlet");
                async.complete();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
            }

        });


    }
}
