package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
       @RequestMapping("/")
    public String index() {
        String html = "<h1>Hello World!</h1>\n" +
         "<p>This web app is powered by \n" +
<<<<<<< HEAD
        "<a href='https://github.com/mygithubid/spring-boot-minimal-webapp'>this github repo</a></p>\n";
=======
        "<a href='https://github.com/sqing73/spring-boot-minimal-webapp'>this github repo</a></p>\n";
>>>>>>> 1f2020daeabe73d41abc9468085d395f1dc0c89c
        return html;
    }

    
}
