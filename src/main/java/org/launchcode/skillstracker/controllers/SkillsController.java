package org.launchcode.skillstracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    @GetMapping
    @ResponseBody
    public String displayThreeLanguages() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "  <ol>" +
                "    <li>Python</li>" +
                "    <li>Java</li>" +
                "    <li>Javascript</li>" +
                "  </ol>" +
                "</body>" +
                "</html>";
    }
    @PostMapping("form/completed")
    @ResponseBody
    public String enteredForm(@RequestParam String name, @RequestParam String favorite, @RequestParam String favorite2, @RequestParam String favorite3) {
        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + favorite + "</li>" +
                "<li>" + favorite2 + "</li>" +
                "<li>" + favorite3 + "</li>" +
                "</body>" +
                "<html>";
    }

    @GetMapping("form")
    @ResponseBody
    public String displayForm () {
    String form = "<body>" +
            "<form method= 'post' action='/form/completed'>" +
            "  <label for='name'>Name: " +
            "    <input type='text' name='name' />" +
            "  </label>" +
            "  <br>" +
            "  <table>" +
            "    <tr>" +
            "      <td>Favorite Language</td>" +
            "      <td><select name='favorite' type='text'>" +
            "        <option value='Python'>Python</option>" +
            "        <option value='Java'>Java</option>" +
            "        <option value='Javascript'>Javascript</option>" +
            "      </select></td>" +
            "    </tr>" +
            "    <tr>" +
            "      <td>Second Favorite Language</td>" +
            "      <td><select name='favorite2' type='text'>" +
            "        <option value='Python'>Python</option>" +
            "        <option value='Java'>Java</option>" +
            "        <option value='Javascript'>Javascript</option>" +
            "      </select></td>" +
            "    </tr>" +
            "    <tr>" +
            "      <td>Third Favorite Language</td>" +
            "      <td><select name='favorite3' type='text'>" +
            "        <option value='Python'>Python</option>" +
            "        <option value='Java'>Java</option>" +
            "        <option value='Javascript'>Javascript</option>" +
            "      </select></td>" +
            "    </tr>" +
            "  </table> " +
            "  <br>" +
            "  <input type='submit' />" +
            "</form>" +
            "</body>" +
            "</html>";
        return form;
    }



}
