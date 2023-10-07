package StringBuilder;

import StringBuilder.entities.Comment;
import StringBuilder.entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Ow the best post");
        Comment c2 = new Comment("That's awesome");

        Post p1 = new Post(
                sdf.parse("21/05/2020 12:22:00"),
                "Traveling now for Brazil",
                "Do you create a powerful experience",
                23
        );


        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);


    }




}
