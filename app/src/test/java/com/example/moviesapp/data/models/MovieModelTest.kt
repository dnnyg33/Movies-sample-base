package com.example.moviesapp.data.models

import com.google.common.truth.Truth.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class MovieModelTest{
    private lateinit var movieModel: MovieRowViewState

    @Test
    fun `test average rating returns correct average`(){
        movieModel = MovieRowViewState(
            "Himlens barn-1997",
            "Himlens barn",
            "https://images-na.ssl-images-amazon.com/images/M/MV5BZTYwZWQ4ZTQtZWU0MS00N2YwLWEzMDItZWFkZWY0MWVjODVhXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_SY446_SX290_AL_.jpg",
            "89M",
            listOf("Action", "Crime", "Drama"),
            listOf("Mohammad Amir Naji", "Amir Farrokh Hashemian", "Bahare Seddiqi"),
            "1999-01-22",
            "Zahra's shoes are gone; her older brother Ali lost them. They are poor, there are no shoes for Zahra until they come up with an idea: they will share one pair of shoes, Ali's. School awaits. Will the plan succeed?                Written by\nEileen Berdon <eberdon@aol.com>",
            "1997",
            listOf(7, 6, 9, 4, 8, 10, 2, 5, 1, 4, 8, 5, 10, 5, 7, 6, 8, 5, 9, 3, 10, 2, 6, 7, 9, 7, 4, 1, 8, 7)
        )
        assertThat(movieModel.averageRating).isEqualTo(6.1)
    }

    @Test
    fun `rating above 5 is thumbs up`(){
        movieModel = MovieRowViewState(
            "Himlens barn-1997",
            "Himlens barn",
            "https://images-na.ssl-images-amazon.com/images/M/MV5BZTYwZWQ4ZTQtZWU0MS00N2YwLWEzMDItZWFkZWY0MWVjODVhXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_SY446_SX290_AL_.jpg",
            "89M",
            listOf("Action", "Crime", "Drama"),
            listOf("Mohammad Amir Naji", "Amir Farrokh Hashemian", "Bahare Seddiqi"),
            "1999-01-22",
            "Zahra's shoes are gone; her older brother Ali lost them. They are poor, there are no shoes for Zahra until they come up with an idea: they will share one pair of shoes, Ali's. School awaits. Will the plan succeed?                Written by\nEileen Berdon <eberdon@aol.com>",
            "1997",
            listOf(7,7,7,7,7,7)
        )
        assertThat(movieModel.thumbsUp).isTrue()
    }

    @Test
    fun `rating below 5 is not thumbs up`(){
        movieModel = MovieRowViewState(
            "Himlens barn-1997",
            "Himlens barn",
            "https://images-na.ssl-images-amazon.com/images/M/MV5BZTYwZWQ4ZTQtZWU0MS00N2YwLWEzMDItZWFkZWY0MWVjODVhXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_SY446_SX290_AL_.jpg",
            "89M",
            listOf("Action", "Crime", "Drama"),
            listOf("Mohammad Amir Naji", "Amir Farrokh Hashemian", "Bahare Seddiqi"),
            "1999-01-22",
            "Zahra's shoes are gone; her older brother Ali lost them. They are poor, there are no shoes for Zahra until they come up with an idea: they will share one pair of shoes, Ali's. School awaits. Will the plan succeed?                Written by\nEileen Berdon <eberdon@aol.com>",
            "1997",
            listOf(4,4,4,4,4,4)
        )
        assertThat(movieModel.thumbsUp).isFalse()
    }

    @Test
    fun `rating of exactly 5 is not thumbs up`(){
        movieModel = MovieRowViewState(
            "Himlens barn-1997",
            "Himlens barn",
            "https://images-na.ssl-images-amazon.com/images/M/MV5BZTYwZWQ4ZTQtZWU0MS00N2YwLWEzMDItZWFkZWY0MWVjODVhXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_SY446_SX290_AL_.jpg",
            "89M",
            listOf("Action", "Crime", "Drama"),
            listOf("Mohammad Amir Naji", "Amir Farrokh Hashemian", "Bahare Seddiqi"),
            "1999-01-22",
            "Zahra's shoes are gone; her older brother Ali lost them. They are poor, there are no shoes for Zahra until they come up with an idea: they will share one pair of shoes, Ali's. School awaits. Will the plan succeed?                Written by\nEileen Berdon <eberdon@aol.com>",
            "1997",
            listOf(5,5,5,5,5)
        )
        assertThat(movieModel.thumbsUp).isFalse()
    }

    @Test
    fun `movie that is less than 90 minutes is short`(){
        movieModel = MovieRowViewState(
            "Himlens barn-1997",
            "Himlens barn",
            "https://images-na.ssl-images-amazon.com/images/M/MV5BZTYwZWQ4ZTQtZWU0MS00N2YwLWEzMDItZWFkZWY0MWVjODVhXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_SY446_SX290_AL_.jpg",
            "89M",
            listOf("Action", "Crime", "Drama"),
            listOf("Mohammad Amir Naji", "Amir Farrokh Hashemian", "Bahare Seddiqi"),
            "1999-01-22",
            "Zahra's shoes are gone; her older brother Ali lost them. They are poor, there are no shoes for Zahra until they come up with an idea: they will share one pair of shoes, Ali's. School awaits. Will the plan succeed?                Written by\nEileen Berdon <eberdon@aol.com>",
            "1997",
            listOf(7, 6, 9, 4, 8, 10, 2, 5, 1, 4, 8, 5, 10, 5, 7, 6, 8, 5, 9, 3, 10, 2, 6, 7, 9, 7, 4, 1, 8, 7)
        )
        assertThat(movieModel.isShort).isTrue()
    }

    @Test
    fun `movie that is more than 90 minutes is not short`(){
        movieModel = MovieRowViewState(
            "Himlens barn-1997",
            "Himlens barn",
            "https://images-na.ssl-images-amazon.com/images/M/MV5BZTYwZWQ4ZTQtZWU0MS00N2YwLWEzMDItZWFkZWY0MWVjODVhXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_SY446_SX290_AL_.jpg",
            "105M",
            listOf("Action", "Crime", "Drama"),
            listOf("Mohammad Amir Naji", "Amir Farrokh Hashemian", "Bahare Seddiqi"),
            "1999-01-22",
            "Zahra's shoes are gone; her older brother Ali lost them. They are poor, there are no shoes for Zahra until they come up with an idea: they will share one pair of shoes, Ali's. School awaits. Will the plan succeed?                Written by\nEileen Berdon <eberdon@aol.com>",
            "1997",
            listOf(7, 6, 9, 4, 8, 10, 2, 5, 1, 4, 8, 5, 10, 5, 7, 6, 8, 5, 9, 3, 10, 2, 6, 7, 9, 7, 4, 1, 8, 7)
        )
        assertThat(movieModel.isShort).isFalse()
    }

    @Test
    fun `movie that is exactly 90 minutes is not short`(){
        movieModel = MovieRowViewState(
            "Himlens barn-1997",
            "Himlens barn",
            "https://images-na.ssl-images-amazon.com/images/M/MV5BZTYwZWQ4ZTQtZWU0MS00N2YwLWEzMDItZWFkZWY0MWVjODVhXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_SY446_SX290_AL_.jpg",
            "105M",
            listOf("Action", "Crime", "Drama"),
            listOf("Mohammad Amir Naji", "Amir Farrokh Hashemian", "Bahare Seddiqi"),
            "1999-01-22",
            "Zahra's shoes are gone; her older brother Ali lost them. They are poor, there are no shoes for Zahra until they come up with an idea: they will share one pair of shoes, Ali's. School awaits. Will the plan succeed?                Written by\nEileen Berdon <eberdon@aol.com>",
            "1997",
            listOf(7, 6, 9, 4, 8, 10, 2, 5, 1, 4, 8, 5, 10, 5, 7, 6, 8, 5, 9, 3, 10, 2, 6, 7, 9, 7, 4, 1, 8, 7)
        )
        assertThat(movieModel.isShort).isFalse()
    }

    @Test
    fun `format duration formats properly`(){
        movieModel = MovieRowViewState(
            "Himlens barn-1997",
            "Himlens barn",
            "https://images-na.ssl-images-amazon.com/images/M/MV5BZTYwZWQ4ZTQtZWU0MS00N2YwLWEzMDItZWFkZWY0MWVjODVhXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_SY446_SX290_AL_.jpg",
            "105M",
            listOf("Action", "Crime", "Drama"),
            listOf("Mohammad Amir Naji", "Amir Farrokh Hashemian", "Bahare Seddiqi"),
            "1999-01-22",
            "Zahra's shoes are gone; her older brother Ali lost them. They are poor, there are no shoes for Zahra until they come up with an idea: they will share one pair of shoes, Ali's. School awaits. Will the plan succeed?                Written by\nEileen Berdon <eberdon@aol.com>",
            "1997",
            listOf(7, 6, 9, 4, 8, 10, 2, 5, 1, 4, 8, 5, 10, 5, 7, 6, 8, 5, 9, 3, 10, 2, 6, 7, 9, 7, 4, 1, 8, 7)
        )
        assertThat(movieModel.formattedDuration).isEqualTo("1h 45m")
    }

    @Test
    fun `format release date formats properly`(){
        movieModel = MovieRowViewState(
            "Himlens barn-1997",
            "Himlens barn",
            "https://images-na.ssl-images-amazon.com/images/M/MV5BZTYwZWQ4ZTQtZWU0MS00N2YwLWEzMDItZWFkZWY0MWVjODVhXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_SY446_SX290_AL_.jpg",
            "105M",
            listOf("Action", "Crime", "Drama"),
            listOf("Mohammad Amir Naji", "Amir Farrokh Hashemian", "Bahare Seddiqi"),
            "1999-01-22",
            "Zahra's shoes are gone; her older brother Ali lost them. They are poor, there are no shoes for Zahra until they come up with an idea: they will share one pair of shoes, Ali's. School awaits. Will the plan succeed?                Written by\nEileen Berdon <eberdon@aol.com>",
            "1997",
            listOf(7, 6, 9, 4, 8, 10, 2, 5, 1, 4, 8, 5, 10, 5, 7, 6, 8, 5, 9, 3, 10, 2, 6, 7, 9, 7, 4, 1, 8, 7)
        )
        assertThat(movieModel.formattedReleaseDate).isEqualTo("Jan 22, 1999")
    }
}