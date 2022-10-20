Build an Android application that has two screens. One shows a list of movies (from provided JSON files) and the second shows details of a particular movie. Users should be able to open the Movie Detail screen (2nd screen) by clicking on a movie from the Movie List (1st screen).

  




About data:

1.	`MovieInfo.json`
-	This json file contains an array of Movies
-	Download from https://api.jsonbin.io
    -	Get movie info from: https://api.jsonbin.io/v3/b/630ce21d5c146d63ca84a405
    -	Access rating from: https://api.jsonbin.io/v3/b/630ce21d5c146d63ca84a405

-	Fields 
    -	ID  e.g. "Himlens barn-1997" (Unique Identifier for the movie)
    -	Title e.g. “Himlens barn”
    -	Genres (Names of genres) e.g. ["Drama", "Family"]
    -	Duration e.g. “89M” - (89 minutes)
    -	Release Date e.g. "1999-01-22" - (“YYYY-MM-DD” formatted)
    -	Storyline e.g. “Zahra's shoes are gone; her older brother Ali lost them.........”
    -	Actors (Names of actors) e.g. ["Mohammad Amir", "Amir Farrokh", "Bahare"]
    -	Poster URL (url of movie poster)

2.	`MovieRatings.json`
  -	This file contains user ratings for Movies
  -	Download from https://api.jsonbin.io/b/5f2c4951dddf413f95be721c
  -	Fields
    -	ID e.g. "Himlens barn-1997" (Unique Identifier for the movie)
    -	Ratings e.g. [6, 7, 4, 10, 5] - each rating is a score out of 10

Requirement:
  -	Data should be accessed from network calls at runtime without blocking UI thread.
  -	Movie List Screen
    -	Movie list shows movies from `MovieInfo.json`
    -	Title of the screen : “Famous Movies”
    -	Each row of movie should show following information about the movie
        -	Title
        -	Release Date (should read like “Jan 22, 1999” format)
        -	Poster Image
        -	Genres
        -	Average user rating (This is mean of all user rating scores for the movie from `MovieRatings.json`)
        -	Short category
        -	If the movie is less than 90 minutes add a view that says "Short"
    -	Clicking on row should open detail page for that movie
    -	Movies should be sorted by rating with highest ratings first.
    -	Do not show any movies that have a release date before 1980
  -	Movie Detail Screen
    -	This screen shows details about the selected movie
    -	Title of the movie should be set as toolbar title
    -	This screen should show the following information about the movie (given order is irrelevant)
        -	Title
        -	Genres
        -	Duration (A movie that is 89 minutes should read like “1 hour and 29 minutes”)
        -	Release Date (should read like “Jan 22, 1999” format)
        -	Full storyline with no trimming
        -	Names of actors
        -	Average user rating (This is mean of all user rating scores for the movie from `MovieRatings.json`)
        -	Poster Image
    -	If the movie has an average rating of 5 or less,, there should be an thumbs down icon (use default Material vector icon)
        -	Otherwise show a thumbs up icon.



Notes:
  -	Create User Interface (UI) using your understanding of Android UI design.
  -	Feel free to use any Component or Library that is publicly available.
  -	You can use any architecture of your choosing.
  -	We’re looking for code that is clean, testable, readable, performant, and maintainable. We want to see your best work!
  -	A large portion of points are awarded for valid unit tests covering any business logic.
  -	You will have 24 hours to submit your work, however you will also receive some bonus points for speed.
  -	Finally, please include your name in the application name. ex// “John Smith Movies app”

 


