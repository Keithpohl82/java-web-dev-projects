package org.launchcode.skill_tracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {


    @GetMapping("/")
    public String homepage(){
        return "<html>" +
                "<body>" +
                "<h1>" +
                "Skill Tracker" +
                "<h2>" +
                "We have a few languages we would like you to learn" +
                "<ol>" +
                "<li>" +
                "Java" +
                "</li>" +
                "<li>" +
                "Javascript" +
                "</li>" +
                "<li>" +
                "Python" +
                "</li>" +
                "</ol>" +
                "</h2>" +
                "</h1>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    public String formPage(){
        return "<html>" +
                "<body>" +
                "<form action= 'form' method='post'>" +
                "<h1>" +
                "Name: " +
                "</h1>" +
                "<input type='text' name='name'>" +
                "<h1>" +
                "First favorite language" +
                "</h1>" +
                "<select name='favorite'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<h1>" +
                "Second favorite language" +
                "</h1>" +
                "<select name='secondFavorite'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<h1>" +
                "Least favorite language" +
                "</h1>" +
                "<select name='leastFavorite'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<input type = 'submit' value = 'postTable'/>";

    }

//    @PostMapping("form")
//    public String postList(@RequestParam String name, String favorite, String secondFavorite, String leastFavorite){
//        return "<html>" +
//                "<h1>" +
//                name +
//                "</h1>" +
//                "<ol>" +
//                "<li>" +
//                favorite +
//                "</li>" +
//                "<li>" +
//                secondFavorite +
//                "</li>" +
//                "<li>" +
//                leastFavorite +
//                "</li>" +
//                "</html>";
//    }

    @PostMapping("form")
    public String postTable(@RequestParam String name, String favorite, String secondFavorite, String leastFavorite){
        return "<html>" +
                "<h1>" +
                name +
                "</h1>" +
                "<table>" +
                "<tr>" +
                "<th>" +
                "Favorite language" +
                "</th>" +
                "<th>" +
                 "Second favorite language" +
                "<th>" +
                "Least Favorite language" +
                "</th>" +
                "</tr>" +
                "<tr>" +
                "<td>" +
                favorite +
                "</td>" +
                "<td>" +
                secondFavorite +
                "</td>" +
                "<td>" +
                leastFavorite +
                "</td>" +
                "</tr>" +
                "</table>" ;
    }
}
