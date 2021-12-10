package com.codeclan.final_project.media_app_server.components;

import com.codeclan.final_project.media_app_server.models.Movie;
import com.codeclan.final_project.media_app_server.models.MovieList;
import com.codeclan.final_project.media_app_server.models.SavedMovie;
import com.codeclan.final_project.media_app_server.repositories.MovieListRepository;
import com.codeclan.final_project.media_app_server.repositories.MovieRepository;
import com.codeclan.final_project.media_app_server.repositories.SavedMovieRepository;
import org.hibernate.resource.beans.internal.FallbackBeanInstanceProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    MovieRepository movieRepository;

    @Autowired
    MovieListRepository movieListRepository;

    @Autowired
    SavedMovieRepository savedMovieRepository;

    public DataLoader(){

    }


    public void run(ApplicationArguments args) {

//         MOVIES
        Movie redNotice = new Movie("Red Notice", "Action", 1.30, "October 10th, 2021",
                "An Interpol-issued Red Notice is a global alert to hunt and capture the world's most wanted. But when a daring heist brings together the FBI's top profiler and two rival criminals, there's no telling what will happen.",
                "Netflix, Amazon", "https://www.imdb.com/title/tt7991608/",
                "https://image.tmdb.org/t/p/original/wdE6ewaKZHr62bLqCn7A2DiGShm.jpg");
        movieRepository.save(redNotice);

        Movie freeGuy = new Movie("Free Guy", "Comedy", 1.30, "October 10th, 2021",
                "A bank teller called Guy realizes he is a background character in an open world video game called Free City that will soon go offline.",
                "Netflix, Amazon", "https://www.imdb.com/title/tt6264654/?ref_=nv_sr_srsg_0",
                "https://image.tmdb.org/t/p/original/xmbU4JTUm8rsdtn7Y3Fcm30GpeT.jpg");
        movieRepository.save(freeGuy);

        Movie shangChi = new Movie("Shang-Chi and the Legend of the Ten Rings", "Fantasy", 1.30, "October 10th, 2021",
                "Shang-Chi must confront the past he thought he left behind when he is drawn into the web of the mysterious Ten Rings organization.",
                "Netflix, Amazon", "https://www.imdb.com/title/tt9376612/?ref_=nv_sr_srsg_0", "https://image.tmdb.org/t/p/original/1BIoJGKbXjdFDAqUEiA2VHqkK1Z.jpg");
        movieRepository.save(shangChi);

        Movie armyOfThieves = new Movie("Army of Thieves", "Action", 1.30, "2021-10-27",
                "A mysterious woman recruits bank teller Ludwig Dieter to lead a group of aspiring thieves on a top-secret heist during the early stages of the zombie apocalypse.",
                "Netflix, Amazon", "https://www.imdb.com/title/tt13024674/?ref_=nv_sr_srsg_0", "https://image.tmdb.org/t/p/original/iPTZGFmPs7HsXHYxiuxGolihjOH.jpg");
        movieRepository.save(armyOfThieves);

        Movie venom = new Movie("Venom: Let There Be Carnage", "Fantasy", 1.45, "2021-10-27",
                "After finding a host body in investigative reporter Eddie Brock, the alien symbiote must face a new enemy, Carnage, the alter ego of serial killer Cletus Kasady.",
                "Amazon", "https://www.imdb.com/title/tt7097896/", "https://image.tmdb.org/t/p/original/rjkmN1dniUHVYAtwuV3Tji7FsDO.jpg");
        movieRepository.save(venom);

        Movie lastDuel = new Movie("The Last Duel", "Action", 1.30, "2021-10-15",
                "King Charles VI declares that Knight Jean de Carrouges settle his dispute with his squire, Jacques Le Gris, by challenging him to a duel.",
                "Netflix", "https://www.imdb.com/title/tt4244994/?ref_=fn_al_tt_1", "https://image.tmdb.org/t/p/original/zjrJE0fpzPvX8saJXj8VNfcjBoU.jpg");
        movieRepository.save(lastDuel);

        Movie spiderMan = new Movie("Spider-Man: No Way Home", "Fantasy", 1.30, "2021-12-15",
                "Peter Parker is unmasked and no longer able to separate his normal life from the high-stakes of being a super-hero. When he asks for help from Doctor Strange the stakes become even more dangerous, forcing him to discover what it truly means to be Spider-Man.",
                "Amazon", "https://www.imdb.com/title/tt10872600/?ref_=nv_sr_srsg_0", "https://image.tmdb.org/t/p/original/1g0dhYtq4irTY1GPXvft6k4YLjm.jpg");
        movieRepository.save(spiderMan);

        Movie bossBaby = new Movie("The Boss Baby: Family Business", "Animation", 1.30, "2021-08-22",
                "The Templeton brothers — Tim and his Boss Baby little bro Ted — have become adults and drifted away from each other. But a new boss baby with a cutting-edge approach and a can-do attitude is about to bring them together again … and inspire a new family business.",
                "Netflix", "https://www.imdb.com/title/tt6932874/?ref_=nv_sr_srsg_0", "https://image.tmdb.org/t/p/original/kv2Qk9MKFFQo4WQPaYta599HkJP.jpg");
        movieRepository.save(bossBaby);

        Movie homeAlone = new Movie("Home Sweet Home Alone", "Comedy", 1.30, "2021-11-12",
                "After being left at home by himself for the holidays, 10-year-old Max Mercer must work to defend his home from a married couple who tries to steal back a valuable heirloom.",
                "Netflix", "https://www.imdb.com/title/tt11012066/?ref_=nv_sr_srsg_3", "https://image.tmdb.org/t/p/original/fP3VvqUjEBjawxZHL4sYCq2ZdJD.jpg");
        movieRepository.save(homeAlone);

        Movie jungleCruise = new Movie("Jungle Cruise", "Comedy", 1.30, "2021-07-30",
                "Dr. Lily Houghton enlists the aid of wisecracking skipper Frank Wolff to take her down the Amazon in his dilapidated boat. Together, they search for an ancient tree that holds the power to heal – a discovery that will change the future of medicine.",
                "Amazon", "https://www.imdb.com/title/tt0870154/?ref_=nv_sr_srsg_0", "https://image.tmdb.org/t/p/original/9dKCd55IuTT5QRs989m9Qlb7d2B.jpg");
        movieRepository.save(jungleCruise);

        Movie pawPatrol = new Movie("PAW Patrol: The Movie", "Animation", 1.30, "2021-08-09",
                "Ryder and the pups are called to Adventure City to stop Mayor Humdinger from turning the bustling metropolis into a state of chaos.",
                "Netflix", "https://www.imdb.com/title/tt11832046/?ref_=nv_sr_srsg_0", "https://image.tmdb.org/t/p/original/ic0intvXZSfBlYPIvWXpU1ivUCO.jpg");
        movieRepository.save(pawPatrol);

        Movie addamsFamily = new Movie("The Addams Family 2", "Animation", 1.30, "2021-10-08",
                "The Addams get tangled up in more wacky adventures and find themselves involved in hilarious run-ins with all sorts of unsuspecting characters.",
                "Netflix", "https://www.imdb.com/title/tt11125620/?ref_=nv_sr_srsg_4", "https://image.tmdb.org/t/p/original/ld7YB9vBRp1GM1DT3KmFWSmtBPB.jpg");
        movieRepository.save(addamsFamily);

        Movie encanto = new Movie("Encanto", "Animation", 1.30, "2021-11-24",
                "The tale of an extraordinary family, the Madrigals, who live hidden in the mountains of Colombia, in a magical house, in a vibrant town, in a wondrous, charmed place called an Encanto. The magic of the Encanto has blessed every child in the family with a unique gift from super strength to the power to heal—every child except one, Mirabel. But when she discovers that the magic surrounding the Encanto is in danger, Mirabel decides that she, the only ordinary Madrigal, might just be her exceptional family's last hope.",
                "Amazon", "https://www.imdb.com/title/tt2953050/?ref_=nv_sr_srsg_0", "https://image.tmdb.org/t/p/original/4j0PNHkMr5ax3IA8tjtxcmPU3QT.jpg");
        movieRepository.save(encanto);

        Movie clifford = new Movie("Clifford the Big Red Dog", "Animation", 1.30, "2021-12-10",
                "As Emily struggles to fit in at home and at school, she discovers a small red puppy who is destined to become her best friend. When Clifford magically undergoes one heck of a growth spurt, becomes a gigantic dog and attracts the attention of a genetics company, Emily and her Uncle Casey have to fight the forces of greed as they go on the run across New York City. Along the way, Clifford affects the lives of everyone around him and teaches Emily and her uncle the true meaning of acceptance and unconditional love.",
                "Amazon", "https://www.imdb.com/title/tt2397461/?ref_=nv_sr_srsg_0", "https://image.tmdb.org/t/p/original/ygPTrycbMSFDc5zUpy4K5ZZtQSC.jpg");
        movieRepository.save(clifford);

        Movie suicideSquad = new Movie("The Suicide Squad", "Action", 1.30, "2021-07-30", "Supervillains Harley Quinn, Bloodsport, Peacemaker and a collection of nutty cons at Belle Reve prison join the super-secret, super-shady Task Force X as they are dropped off at the remote, enemy-infused island of Corto Maltese.",
                "Netflix", "https://www.imdb.com/title/tt6334354/?ref_=nv_sr_srsg_0", "https://image.tmdb.org/t/p/original/kb4s0ML0iVZlG6wAKbbs9NAm6X.jpg");
        movieRepository.save(suicideSquad);

        Movie mortalKombat = new Movie("Mortal Kombat", "Fantasy", 1.30, "2021-05-06",
                "Washed-up MMA fighter Cole Young, unaware of his heritage, and hunted by Emperor Shang Tsung's best warrior, Sub-Zero, seeks out and trains with Earth's greatest champions as he prepares to stand against the enemies of Outworld in a high stakes battle for the universe.",
                "Netflix", "https://www.imdb.com/title/tt0293429/?ref_=nv_sr_srsg_0", "https://image.tmdb.org/t/p/original/nkayOAUBUu4mMvyNf9iHSUiPjF1.jpg");
        movieRepository.save(mortalKombat);



        // MOVIELISTS
        MovieList favouriteMovies = new MovieList("Favourite Movies");
        movieListRepository.save(favouriteMovies);

        MovieList upcomingMovies = new MovieList("Upcoming Movies");
        movieListRepository.save(upcomingMovies);



        // SAVEDMOVIES
        SavedMovie savedMovie1 = new SavedMovie(redNotice, favouriteMovies, true);
        savedMovieRepository.save(savedMovie1);

        SavedMovie savedMovie2 = new SavedMovie(freeGuy, favouriteMovies, true);
        savedMovieRepository.save(savedMovie2);

        SavedMovie savedMovie3 = new SavedMovie(shangChi, upcomingMovies, false);
        savedMovieRepository.save(savedMovie3);

        SavedMovie savedMovie4 = new SavedMovie(armyOfThieves, upcomingMovies, false);
        savedMovieRepository.save(savedMovie4);

        SavedMovie savedMovie5 = new SavedMovie(venom, upcomingMovies, false);
        savedMovieRepository.save(savedMovie5);



    }


}
