package frank.java.movieratingservice.resources;

import frank.java.movieratingservice.models.Rating;
import frank.java.movieratingservice.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingResource {

    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId) {
        return new Rating(movieId, 4);
    }

    @RequestMapping("users/{userId}")
    public UserRating getRatings(@PathVariable("userId") String userId) {
        return new UserRating(Arrays.asList(
                new Rating("123", 4),
                new Rating("5678", 3)
        ));
    }
}
