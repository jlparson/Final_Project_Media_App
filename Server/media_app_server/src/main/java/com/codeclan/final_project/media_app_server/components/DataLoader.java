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

//         MOVIES (added)
        Movie redNotice = new Movie("Red Notice", "Action", 1.30, "October 10th, 2021",
                "An Interpol-issued Red Notice is a global alert to hunt and capture the world's most wanted. But when a daring heist brings together the FBI's top profiler and two rival criminals, there's no telling what will happen.",
                "Netflix, Amazon", "https://www.imdb.com/title/tt7991608/",
                "https://image.tmdb.org/t/p/original/wdE6ewaKZHr62bLqCn7A2DiGShm.jpg", "Pj0wz7zu3Ms", "https://www.netflix.com/gb/title/81161626");
        movieRepository.save(redNotice);

        Movie freeGuy = new Movie("Free Guy", "Comedy", 1.30, "October 10th, 2021",
                "A bank teller called Guy realizes he is a background character in an open world video game called Free City that will soon go offline.",
                "Netflix, Amazon", "https://www.imdb.com/title/tt6264654/?ref_=nv_sr_srsg_0",
                "https://image.tmdb.org/t/p/original/xmbU4JTUm8rsdtn7Y3Fcm30GpeT.jpg", "X2m-08cOAbc", "https://www.disneyplus.com/en-gb/movies/free-guy/3qBd6ESjzQOm?irclickid=18TzpP1fdxyIRCUVPKWKPSxmUkGw0QxxnRq43E0&irgwc=1&cid=DSS-Affiliate-Impact-Content-JustWatch%20GmbH-705874");
        movieRepository.save(freeGuy);

        Movie shangChi = new Movie("Shang-Chi and the Legend of the Ten Rings", "Fantasy", 1.30, "October 10th, 2021",
                "Shang-Chi must confront the past he thought he left behind when he is drawn into the web of the mysterious Ten Rings organization.",
                "Netflix, Amazon", "https://www.imdb.com/title/tt9376612/?ref_=nv_sr_srsg_0", "https://image.tmdb.org/t/p/original/1BIoJGKbXjdFDAqUEiA2VHqkK1Z.jpg", "8YjFbMbfXaQ", "https://www.disneyplus.com/en-gb/movies/shang-chi-and-the-legend-of-the-ten-rings/5GyV9sf9Y041");
        movieRepository.save(shangChi);

        Movie armyOfThieves = new Movie("Army of Thieves", "Action", 1.30, "2021-10-27",
                "A mysterious woman recruits bank teller Ludwig Dieter to lead a group of aspiring thieves on a top-secret heist during the early stages of the zombie apocalypse.",
                "Netflix, Amazon", "https://www.imdb.com/title/tt13024674/?ref_=nv_sr_srsg_0", "https://image.tmdb.org/t/p/original/iPTZGFmPs7HsXHYxiuxGolihjOH.jpg", "Ith2WetKXlg", "https://www.netflix.com/gb/title/81185548");
        movieRepository.save(armyOfThieves);

        Movie venom = new Movie("Venom: Let There Be Carnage", "Fantasy", 1.45, "2021-10-27",
                "After finding a host body in investigative reporter Eddie Brock, the alien symbiote must face a new enemy, Carnage, the alter ego of serial killer Cletus Kasady.",
                "Amazon", "https://www.imdb.com/title/tt7097896/", "https://image.tmdb.org/t/p/original/rjkmN1dniUHVYAtwuV3Tji7FsDO.jpg", "rrwBnlYOp4g", "https://www.amazon.co.uk/gp/video/detail/0SJ5QDQ0BK0F2DE0KCUM6DJB87/ref=atv_dl_rdr?tag=just016-21");
        movieRepository.save(venom);

        Movie lastDuel = new Movie("The Last Duel", "Action", 1.30, "2021-10-15",
                "King Charles VI declares that Knight Jean de Carrouges settle his dispute with his squire, Jacques Le Gris, by challenging him to a duel.",
                "Netflix", "https://www.imdb.com/title/tt4244994/?ref_=fn_al_tt_1", "https://image.tmdb.org/t/p/original/zjrJE0fpzPvX8saJXj8VNfcjBoU.jpg", "mgygUwPJvYk", "https://www.disneyplus.com/en-gb/movies/the-last-duel/45hE0MfqpDER?irclickid=18TzpP1fdxyIRCUVPKWKPSxmUkGw0SUBnRq43E0&irgwc=1&cid=DSS-Affiliate-Impact-Content-JustWatch%20GmbH-705874");
        movieRepository.save(lastDuel);

        Movie bossBaby = new Movie("The Boss Baby: Family Business", "Animation", 1.30, "2021-08-22",
                "The Templeton brothers — Tim and his Boss Baby little bro Ted — have become adults and drifted away from each other. But a new boss baby with a cutting-edge approach and a can-do attitude is about to bring them together again … and inspire a new family business.",
                "Netflix", "https://www.imdb.com/title/tt6932874/?ref_=nv_sr_srsg_0", "https://image.tmdb.org/t/p/original/kv2Qk9MKFFQo4WQPaYta599HkJP.jpg", "h45V1RXrKqE", "https://tv.apple.com/gb/movie/the-boss-baby-2-family-business/umc.cmc.2wljqyavfsp0ab6g7y13fx8rj?at=1000l3V2&ct=effeteHalicore&playableId=tvs.sbd.9001%3A1574414473");
        movieRepository.save(bossBaby);

        Movie homeAlone = new Movie("Home Sweet Home Alone", "Comedy", 1.30, "2021-11-12",
                "After being left at home by himself for the holidays, 10-year-old Max Mercer must work to defend his home from a married couple who tries to steal back a valuable heirloom.",
                "Netflix", "https://www.imdb.com/title/tt11012066/?ref_=nv_sr_srsg_3", "https://image.tmdb.org/t/p/original/fP3VvqUjEBjawxZHL4sYCq2ZdJD.jpg", "2BkVf2voCr0", "https://www.disneyplus.com/en-gb/movies/home-sweet-home-alone/316tLmyNEXs5?irclickid=18TzpP1fdxyIRCUVPKWKPSxmUkGw0SRZnRq43E0&irgwc=1&cid=DSS-Affiliate-Impact-Content-JustWatch%20GmbH-705874");
        movieRepository.save(homeAlone);

        Movie jungleCruise = new Movie("Jungle Cruise", "Comedy", 1.30, "2021-07-30",
                "Dr. Lily Houghton enlists the aid of wisecracking skipper Frank Wolff to take her down the Amazon in his dilapidated boat. Together, they search for an ancient tree that holds the power to heal – a discovery that will change the future of medicine.",
                "Amazon", "https://www.imdb.com/title/tt0870154/?ref_=nv_sr_srsg_0", "https://image.tmdb.org/t/p/original/9dKCd55IuTT5QRs989m9Qlb7d2B.jpg", "f_HvoipFcA8", "https://www.disneyplus.com/en-gb/movies/jungle-cruise/73QMeTY6Dray?irclickid=18TzpP1fdxyIRCUVPKWKPSxmUkGw0VWFnRq43E0&irgwc=1&cid=DSS-Affiliate-Impact-Content-JustWatch%20GmbH-705874");
        movieRepository.save(jungleCruise);

        Movie pawPatrol = new Movie("PAW Patrol: The Movie", "Animation", 1.30, "2021-08-09",
                "Ryder and the pups are called to Adventure City to stop Mayor Humdinger from turning the bustling metropolis into a state of chaos.",
                "Netflix", "https://www.imdb.com/title/tt11832046/?ref_=nv_sr_srsg_0", "https://image.tmdb.org/t/p/original/ic0intvXZSfBlYPIvWXpU1ivUCO.jpg", "LRMTr2VZcr8", "https://tv.apple.com/gb/movie/paw-patrol-the-movie/umc.cmc.1b6z0h5eywb64d2pzu55mp7k7?at=1000l3V2&ct=effeteHalicore&playableId=tvs.sbd.9001%3A1577856884");
        movieRepository.save(pawPatrol);

        Movie addamsFamily = new Movie("The Addams Family 2", "Animation", 1.30, "2021-10-08",
                "The Addams get tangled up in more wacky adventures and find themselves involved in hilarious run-ins with all sorts of unsuspecting characters.",
                "Netflix", "https://www.imdb.com/title/tt11125620/?ref_=nv_sr_srsg_4", "https://image.tmdb.org/t/p/original/ld7YB9vBRp1GM1DT3KmFWSmtBPB.jpg", "Kd82bSBDE84", "https://tv.apple.com/gb/movie/the-addams-family-2/umc.cmc.7e4suu8fudl9vdlda1w10d67g?at=1000l3V2&ct=effeteHalicore&playableId=tvs.sbd.9001%3A1583979232");
        movieRepository.save(addamsFamily);

        Movie encanto = new Movie("Encanto", "Animation", 1.30, "2021-11-24",
                "The tale of an extraordinary family, the Madrigals, who live hidden in the mountains of Colombia, in a magical house, in a vibrant town, in a wondrous, charmed place called an Encanto. The magic of the Encanto has blessed every child in the family with a unique gift from super strength to the power to heal—every child except one, Mirabel. But when she discovers that the magic surrounding the Encanto is in danger, Mirabel decides that she, the only ordinary Madrigal, might just be her exceptional family's last hope.",
                "Amazon", "https://www.imdb.com/title/tt2953050/?ref_=nv_sr_srsg_0", "https://image.tmdb.org/t/p/original/4j0PNHkMr5ax3IA8tjtxcmPU3QT.jpg", "CaimKeDcudo", "https://www.justwatch.com/uk/movie/encanto");
        movieRepository.save(encanto);


        Movie clifford = new Movie("Clifford the Big Red Dog", "Animation", 1.30, "2021-12-10",
                "As Emily struggles to fit in at home and at school, she discovers a small red puppy who is destined to become her best friend. When Clifford magically undergoes one heck of a growth spurt, becomes a gigantic dog and attracts the attention of a genetics company, Emily and her Uncle Casey have to fight the forces of greed as they go on the run across New York City. Along the way, Clifford affects the lives of everyone around him and teaches Emily and her uncle the true meaning of acceptance and unconditional love.",
                "Amazon", "https://www.imdb.com/title/tt2397461/?ref_=nv_sr_srsg_0", "https://image.tmdb.org/t/p/original/ygPTrycbMSFDc5zUpy4K5ZZtQSC.jpg", "4zH5iYM4wJo", "https://www.justwatch.com/uk/movie/clifford-the-big-red-dog");
        movieRepository.save(clifford);

        Movie suicideSquad = new Movie("The Suicide Squad", "Action", 1.30, "2021-07-30", "Supervillains Harley Quinn, Bloodsport, Peacemaker and a collection of nutty cons at Belle Reve prison join the super-secret, super-shady Task Force X as they are dropped off at the remote, enemy-infused island of Corto Maltese.",
                "Netflix", "https://www.imdb.com/title/tt6334354/?ref_=nv_sr_srsg_0", "https://image.tmdb.org/t/p/original/kb4s0ML0iVZlG6wAKbbs9NAm6X.jpg", "jz1FrtMIh5c", "https://tv.apple.com/gb/movie/the-suicide-squad/umc.cmc.5fnlgufb427ot16l89xbffhuo?at=1000l3V2&ct=effeteHalicore&playableId=tvs.sbd.9001%3A1577436703");
        movieRepository.save(suicideSquad);

        Movie mortalKombat = new Movie("Mortal Kombat", "Fantasy", 1.30, "2021-05-06",
                "Washed-up MMA fighter Cole Young, unaware of his heritage, and hunted by Emperor Shang Tsung's best warrior, Sub-Zero, seeks out and trains with Earth's greatest champions as he prepares to stand against the enemies of Outworld in a high stakes battle for the universe.",
                "Netflix", "https://www.imdb.com/title/tt0293429/?ref_=nv_sr_srsg_0", "https://image.tmdb.org/t/p/original/nkayOAUBUu4mMvyNf9iHSUiPjF1.jpg", "-BQPKD7eozY", "https://www.nowtv.com/watch/mortal-kombat-2021-2021/A5EK6sKrAaydiA9Dxu6ns");
        movieRepository.save(mortalKombat);


//      MOVIES (not yet added)
        Movie spiderMan = new Movie("Spider-Man: No Way Home", "Fantasy", 1.30, "2021-12-15",
                "Peter Parker is unmasked and no longer able to separate his normal life from the high-stakes of being a super-hero. When he asks for help from Doctor Strange the stakes become even more dangerous, forcing him to discover what it truly means to be Spider-Man.",
                "Amazon", "https://www.imdb.com/title/tt10872600/?ref_=nv_sr_srsg_0", "https://image.tmdb.org/t/p/original/1g0dhYtq4irTY1GPXvft6k4YLjm.jpg", "-BQPKD7eozY", "https://www.justwatch.com/uk/movie/spider-man-no-way-home");
        movieRepository.save(spiderMan);

        Movie eternals = new Movie("Eternals", "Fantasy", 1.30, "2021-11-05",
                "The Eternals are a team of ancient aliens who have been living on Earth in secret for thousands of years. When an unexpected tragedy forces them out of the shadows, they are forced to reunite against mankind’s most ancient enemy, the Deviants.",
                "Amazon", "https://www.imdb.com/title/tt9032400/?ref_=fn_al_tt_1", "https://image.tmdb.org/t/p/original/6AdXwFTRTAzggD2QUTt5B7JFGKL.jpg", "pWfjJ6bOy7w", "https://www.justwatch.com/uk/movie/eternals");
        movieRepository.save(eternals);

        Movie finch = new Movie("Finch", "Drama", 1.30, "2021-11-05", "On a post-apocalyptic Earth, a robot, built to protect the life of his dying creator's beloved dog, learns about life, love, friendship, and what it means to be human.",
                "Netflix", "https://www.imdb.com/title/tt3420504/?ref_=nv_sr_srsg_0", "https://image.tmdb.org/t/p/original/jKuDyqx7jrjiR9cDzB5pxzhJAdv.jpg", "-0bYWnP3jH4", "https://tv.apple.com/gb/movie/finch/umc.cmc.47dkj9f2ho3h8dwxixflz65q5?ign-itscg=30200&ign-itsct=justwatch&playableId=tvs.sbd.4000%3AA0064701001");
        movieRepository.save(finch);

        Movie amina = new Movie("Amina", "Drama", 1.30, "2021-11-04", "In 16th-century Zazzau, now Zaria, Nigeria, Amina must utilize her military skills and tactics to defend her family's kingdom. Based on a true story.",
                "Netflix", "https://www.imdb.com/title/tt15847872/?ref_=nv_sr_srsg_0", "https://image.tmdb.org/t/p/original/hMIQiwLpBfTfe3ZbRlNx4225Mgg.jpg", "RW87asYGq7g", "https://www.netflix.com/gb/title/81450071");
        movieRepository.save(amina);

        Movie singleAllTheWay = new Movie("Single All the Way", "Romance", 1.30, "2021-12-02", "Desperate to avoid his family’s judgment about his perpetual single status, Peter convinces his best friend Nick to join him for the holidays and pretend that they’re now in a relationship. But when Peter’s mother sets him up on a blind date with her handsome trainer James, the plan goes awry.",
                "Amazon", "https://www.imdb.com/title/tt14315756/?ref_=nv_sr_srsg_0", "https://image.tmdb.org/t/p/original/bfZPNzAwUQZ6FZQi1d136KLr3wl.jpg", "kCQxxqdowOg", "https://www.netflix.com/gb/title/81148358");
        movieRepository.save(singleAllTheWay);

        Movie afterWeFell = new Movie("After We Fell", "Drama", 1.30, "2021-10-22", "Just as Tessa's life begins to become unglued, nothing is what she thought it would be. Not her friends nor her family. The only person that she should be able to rely on is Hardin, who is furious when he discovers the massive secret that she's been keeping. Before Tessa makes the biggest decision of her life, everything changes because of revelations about her family.",
                "Netflix", "https://www.imdb.com/title/tt13069986/?ref_=nv_sr_srsg_0", "https://image.tmdb.org/t/p/original/dU4HfnTEJDf9KvxGS9hgO7BVeju.jpg", "3OHPCurXcTU", "https://www.amazon.co.uk/gp/video/detail/0TK78QSMBF1G9XSEJLMO2CB2ZO/ref=atv_dl_rdr?tag=just016-21");
        movieRepository.save(afterWeFell);

        Movie neverBackDown = new Movie("Never Back Down: Revolt", "Drama", 1.30, "2021-11-16", "An amateur fighter is lured by a trafficking syndicate specializing in elite underground fighting where her brutal captor forces her to fight or face certain death.",
                "Amazon", "https://www.imdb.com/title/tt13470094/?ref_=fn_al_tt_1", "https://image.tmdb.org/t/p/original/icAG01wZyy1ZpS3UEnPReph3jMV.jpg", "SZ8X3uF1FQM", "https://www.justwatch.com/uk/movie/never-back-down-revolt");
        movieRepository.save(neverBackDown);

        Movie spiderManHomecoming = new Movie("Spider-Man: Homecoming", "Fantasy", 1.30, "2017-07-05", "Following the events of Captain America: Civil War, Peter Parker, with the help of his mentor Tony Stark, tries to balance his life as an ordinary high school student in Queens, New York City, with fighting crime as his superhero alter ego Spider-Man as a new threat, the Vulture, emerges.",
                "Amazon", "https://www.imdb.com/title/tt2250912/?ref_=fn_al_tt_1", "https://image.tmdb.org/t/p/original/c24sv2weTHPsmDa7jEMN0m2P3RT.jpg", "39udgGPyYMg", "https://www.netflix.com/gb/title/80166369");
        movieRepository.save(spiderManHomecoming);

        Movie annette = new Movie("Annette", "Drama", 1.35, "2021-09-03", "The story of Henry, a stand-up comedian with a fierce sense of humour and Ann, a singer of international renown. In the spotlight, they are the perfect couple, healthy, happy, and glamourous. The birth of their first child, Annette, a mysterious girl with an exceptional destiny, will change their lives.",
                "Netflix", "https://www.imdb.com/title/tt6217926/?ref_=nv_sr_srsg_0", "https://image.tmdb.org/t/p/original/4FTnypxpGltJdIARrfFsP31pGTp.jpg", "l_EaNpL16SU", "https://www.amazon.co.uk/gp/video/detail/0S5BDPKLJJ1B08T8F01X5Y7GUR/ref=atv_dl_rdr?tag=just016-21");
        movieRepository.save(annette);

        Movie llantoMaldito = new Movie("Llanto Maldito", "Drama", 1.30, "2021-07-29", "Sara and Óscar, a couple going through a marital crisis, decide to spend a week in a remote country cabin with their two children, Alicia and Tomás. The family tries to have a quiet time, but something strange happens there. There is a woman who prowls through the forest and cries uncontrollably looking for a baby she has just lost. This deeply affects the family who will have to stay together to survive this nightmare.",
                "Netflix", "https://www.imdb.com/title/tt12448082/?ref_=fn_al_tt_1", "https://image.tmdb.org/t/p/original/iwlmZKndp7fIfHbxVzQtk9zby3A.jpg", "u1ESJA6ISQk", "https://www.imdb.com/title/tt12448082/");
        movieRepository.save(llantoMaldito);

        Movie powerOfTheDog = new Movie("The Power of the Dog", "Drama", 1.45, "2021-11-19", "A domineering but charismatic rancher wages a war  of intimidation on his brother's new wife and her teen son, until long-hidden secrets come to light.",
                "Amazon", "https://www.imdb.com/title/tt10293406/?ref_=nv_sr_srsg_0", "https://image.tmdb.org/t/p/original/kEy48iCzGnp0ao1cZbNeWR6yIhC.jpg", "LRDPo0CHrko", "https://www.netflix.com/gb/title/81127997");
        movieRepository.save(powerOfTheDog);

        Movie mixedTape = new Movie("Mixtape", "Drama", 1.30, "2021-12-03", "On the eve of Y2K, orphaned 12-year-old Beverly discovers a broken mixtape crafted by her teen parents. Raised by her grandmother - who struggles talking about her late daughter - Beverly sees the mixtape as a chance to finally learn more about her parents.",
                "Amazon", "https://www.imdb.com/title/tt1587420/?ref_=nv_sr_srsg_0", "https://image.tmdb.org/t/p/original/2fpG1PiHPHdLt8X2e7WAct7EVB7.jpg", "IAxDaDw7TfM", "https://www.netflix.com/gb/title/80994277");
        movieRepository.save(mixedTape);

        Movie lastActionHero = new Movie("Last Action Hero", "Action", 2.00, "1993-07-30", "Danny is obsessed with a fictional movie character action hero Jack Slater. When a magical ticket transports him into Jack's latest adventure, Danny finds himself in a world where movie magic and reality collide. Now it's up to Danny to save the life of his hero and new friend.",
                "Netflix", "https://www.imdb.com/title/tt0107362/?ref_=nv_sr_srsg_0", "https://image.tmdb.org/t/p/original/5PE2Luiv5l7YXEuUIBh0ZHuxV52.jpg", "QJ4B_NxsHCI", "https://tv.apple.com/gb/movie/last-action-hero/umc.cmc.4vzx52uf4xb0zpuybqfjjf118?playableId=tvs.sbd.9001%3A532285806");
        movieRepository.save(lastActionHero);

        Movie totalRecall = new Movie("Total Recall", "Action", 1.45, "1990-06-01", "Construction worker Douglas Quaid's obsession with the planet Mars leads him to visit Recall, a company who manufacture memories. Something goes wrong during his memory implant turning Doug's life upside down and even to question what is reality and what isn't.",
                "Netflix", "https://www.imdb.com/title/tt0100802/?ref_=nv_sr_srsg_0", "https://image.tmdb.org/t/p/original/wVbeL6fkbTKSmNfalj4VoAUUqJv.jpg", "WFMLGEHdIjE", "https://www.nowtv.com/watch/total-recall-1990-1990/A5EK6sKrAaybUyGFG3U3d");
        movieRepository.save(totalRecall);

        Movie theTerminator = new Movie("The Terminator", "Action", 1.45, "1984-10-26", "In the post-apocalyptic future, reigning tyrannical supercomputers teleport a cyborg assassin known as the \\\"Terminator\\\" back to 1984 to kill Sarah Connor, whose unborn son is destined to lead insurgents against 21st century mechanical hegemony. Meanwhile, the human-resistance movement dispatches a lone warrior to safeguard Sarah. Can he stop the virtually indestructible killing machine?",
                "Netflix", "imdb.com/title/tt0088247/?ref_=nv_sr_srsg_3", "https://image.tmdb.org/t/p/original/qvktm0BHcnmDpul4Hz01GIazWPr.jpg", "k64P4l2Wmeg", "https://tv.apple.com/gb/movie/the-terminator/umc.cmc.14nmbhqhdyj6b4dfol85fpoou?at=1000l3V2&ct=effeteHalicore&playableId=tvs.sbd.9001%3A271991087");
        movieRepository.save(theTerminator);

        Movie terminator2 = new Movie("Terminator 2: Judgment Day", "Action", 1.45, "1991-07-03", "Nearly 10 years have passed since Sarah Connor was targeted for termination by a cyborg from the future. Now her son, John, the future leader of the resistance, is the target for a newer, more deadly terminator. Once again, the resistance has managed to send a protector back to attempt to save John and his mother Sarah.",
                "Amazon", "https://www.imdb.com/title/tt0103064/?ref_=nv_sr_srsg_0", "https://image.tmdb.org/t/p/original/weVXMD5QBGeQil4HEATZqAkXeEc.jpg", "lwSysg9o7wE", "https://tv.apple.com/gb/movie/terminator-2-judgement-day/umc.cmc.1zt8xklrl4a6zim4n4iq2qyp2?at=1000l3V2&ct=effeteHalicore&playableId=tvs.sbd.9001%3A1292569511");
        movieRepository.save(terminator2);

        Movie runningMan = new Movie("The Running Man", "Action", 1.45, "1987-11-13", "By 2017, the global economy has collapsed and U.S. society has become a totalitarian police state, censoring all cultural activity. The government pacifies the populace by broadcasting a number of game shows in which convicted criminals fight for their lives, including the gladiator-style The Running Man, hosted by the ruthless Damon Killian, where “runners” attempt to evade “stalkers” and certain death for a chance to be pardoned and set free.",
                "Amazon", "https://www.imdb.com/title/tt0093894/?ref_=nv_sr_srsg_0", "https://image.tmdb.org/t/p/original/GTAUOhO4BN0peJVvxGEQydJvUO.jpg", "pkAN5rGGP1M", "https://www.nowtv.com/watch/the-running-man-1987/A5EK6sKrAayaNVHyN7r55");
        movieRepository.save(runningMan);

        Movie raya = new Movie("Raya and the Last Dragon", "Animation", 1.30, "2021-03-03", "Long ago, in the fantasy world of Kumandra, humans and dragons lived together in harmony. But when an evil force threatened the land, the dragons sacrificed themselves to save humanity. Now, 500 years later, that same evil has returned and it’s up to a lone warrior, Raya, to track down the legendary last dragon to restore the fractured land and its divided people.",
                "Amazon", "https://www.imdb.com/title/tt5109280/?ref_=nv_sr_srsg_0", "https://image.tmdb.org/t/p/original/lPsD10PP4rgUGiGR4CCXA6iY0QQ.jpg", "1VIZ89FEjYI", "https://www.disneyplus.com/en-gb/movies/raya-and-the-last-dragon/6dyengbx3iYK?irclickid=2c60xx1k4xyITxN1QhQVjUoNUkGw0lWs2VusUo0&irgwc=1&cid=DSS-Affiliate-Impact-Content-JustWatch%20GmbH-705874");
        movieRepository.save(raya);

        Movie frozen = new Movie("Frozen", "Animation", 1.30, "2013-11-20", "Young princess Anna of Arendelle dreams about finding true love at her sister Elsa’s coronation. Fate takes her on a dangerous journey in an attempt to end the eternal winter that has fallen over the kingdom. She's accompanied by ice delivery man Kristoff, his reindeer Sven, and snowman Olaf. On an adventure where she will find out what friendship, courage, family, and true love really means.",
                "Netflix", "https://www.imdb.com/title/tt2294629/?ref_=nv_sr_srsg_0", "https://image.tmdb.org/t/p/original/kgwjIb2JDHRhNk13lmSxiClFjVk.jpg", "TbQm5doF_Uc", "https://www.disneyplus.com/en-gb/movies/frozen/4uKGzAJi3ROz?irclickid=2c60xx1k4xyITxN1QhQVjUoNUkGw0lQw2VusUo0&irgwc=1&cid=DSS-Affiliate-Impact-Content-JustWatch%20GmbH-705874");
        movieRepository.save(frozen);

        Movie frozen2 = new Movie("Frozen II", "Animation", 1.30, "2019-11-20", "Elsa, Anna, Kristoff and Olaf head far into the forest to learn the truth about an ancient mystery of their kingdom.",
                "Netflix", "https://www.imdb.com/title/tt4520988/?ref_=nv_sr_srsg_3", "https://image.tmdb.org/t/p/original/mINJaa34MtknCYl5AjtNJzWj8cD.jpg", "Zi4LMpSDccc", "https://www.disneyplus.com/en-gb/movies/frozen-2/28vdy71kJrjb?irclickid=2c60xx1k4xyITxN1QhQVjUoNUkGw0lVM2VusUo0&irgwc=1&cid=DSS-Affiliate-Impact-Content-JustWatch%20GmbH-705874");
        movieRepository.save(frozen2);





        // MOVIELISTS
        MovieList recommendedMovies = new MovieList("Recommended");
        movieListRepository.save(recommendedMovies);

        MovieList recentlyAddedMovies = new MovieList("Recently Added");
        movieListRepository.save(recentlyAddedMovies);

        MovieList familyFriendly = new MovieList("Family Friendly");
        movieListRepository.save(familyFriendly);

        MovieList favouriteMovies = new MovieList("Favourite movies");
        movieListRepository.save(favouriteMovies);

        MovieList watchLater = new MovieList("Movies to watch later");
        movieListRepository.save(watchLater);

        MovieList familyMovies = new MovieList("Movies to watch with the kids");
        movieListRepository.save(familyMovies);




        // SAVEDMOVIES
        SavedMovie savedMovie101 = new SavedMovie(redNotice, recommendedMovies, true, 0);
        savedMovieRepository.save(savedMovie101);

        SavedMovie savedMovie102 = new SavedMovie(freeGuy, recommendedMovies, true, 0);
        savedMovieRepository.save(savedMovie102);

        SavedMovie savedMovie103 = new SavedMovie(suicideSquad, recommendedMovies, true, 0);
        savedMovieRepository.save(savedMovie103);

        SavedMovie savedMovie104 = new SavedMovie(mortalKombat, recommendedMovies, true, 0);
        savedMovieRepository.save(savedMovie104);

        SavedMovie savedMovie105 = new SavedMovie(jungleCruise, recommendedMovies, true, 0);
        savedMovieRepository.save(savedMovie105);

        SavedMovie savedMovie106 = new SavedMovie(annette, recommendedMovies, true, 0);
        savedMovieRepository.save(savedMovie106);

        SavedMovie savedMovie107 = new SavedMovie(amina, recommendedMovies, true, 0);
        savedMovieRepository.save(savedMovie107);

        SavedMovie savedMovie108 = new SavedMovie(finch, recommendedMovies, true, 0);
        savedMovieRepository.save(savedMovie108);

        SavedMovie savedMovie109 = new SavedMovie(eternals, recommendedMovies, true, 0);
        savedMovieRepository.save(savedMovie109);

        SavedMovie savedMovie110 = new SavedMovie(powerOfTheDog, recommendedMovies, true, 0);
        savedMovieRepository.save(savedMovie110);

        SavedMovie savedMovie111 = new SavedMovie(totalRecall, recommendedMovies, true, 0);
        savedMovieRepository.save(savedMovie111);

        SavedMovie savedMovie112 = new SavedMovie(lastActionHero, recommendedMovies, true, 0);
        savedMovieRepository.save(savedMovie112);

        SavedMovie savedMovie113 = new SavedMovie(runningMan, recommendedMovies, true, 0);




        SavedMovie savedMovie201 = new SavedMovie(shangChi, recentlyAddedMovies, false, 0);
        savedMovieRepository.save(savedMovie201);

        SavedMovie savedMovie202 = new SavedMovie(armyOfThieves, recentlyAddedMovies, false, 0);
        savedMovieRepository.save(savedMovie202);

        SavedMovie savedMovie203 = new SavedMovie(venom, recentlyAddedMovies, false, 0);
        savedMovieRepository.save(savedMovie203);

        SavedMovie savedMovie204 = new SavedMovie(lastDuel, recentlyAddedMovies, false, 0);
        savedMovieRepository.save(savedMovie204);


        SavedMovie savedMovie205 = new SavedMovie(homeAlone, recentlyAddedMovies, false, 0);
        savedMovieRepository.save(savedMovie205);

        SavedMovie savedMovie206 = new SavedMovie(spiderManHomecoming, recentlyAddedMovies, false, 0);
        savedMovieRepository.save(savedMovie206);

        SavedMovie savedMovie207 = new SavedMovie(llantoMaldito, recentlyAddedMovies, false, 0);
        savedMovieRepository.save(savedMovie207);

        SavedMovie savedMovie208 = new SavedMovie(singleAllTheWay, recentlyAddedMovies, false, 0);
        savedMovieRepository.save(savedMovie208);

        SavedMovie savedMovie209 = new SavedMovie(afterWeFell, recentlyAddedMovies, false, 0);
        savedMovieRepository.save(savedMovie209);

        SavedMovie savedMovie210 = new SavedMovie(neverBackDown, recentlyAddedMovies, false, 0);
        savedMovieRepository.save(savedMovie210);

        SavedMovie savedMovie211 = new SavedMovie(theTerminator, recentlyAddedMovies, false, 0);
        savedMovieRepository.save(savedMovie211);

        SavedMovie savedMovie212 = new SavedMovie(terminator2, recentlyAddedMovies, false, 0);
        savedMovieRepository.save(savedMovie212);




        SavedMovie savedMovie301 = new SavedMovie(pawPatrol, familyFriendly,false, 0);
        savedMovieRepository.save(savedMovie301);

        SavedMovie savedMovie302 = new SavedMovie(addamsFamily, familyFriendly,false, 0);
        savedMovieRepository.save(savedMovie302);

        SavedMovie savedMovie303 = new SavedMovie(encanto, familyFriendly,false, 0);
        savedMovieRepository.save(savedMovie303);

        SavedMovie savedMovie304 = new SavedMovie(clifford, familyFriendly,false, 0);
        savedMovieRepository.save(savedMovie304);

        SavedMovie savedMovie305 = new SavedMovie(bossBaby, familyFriendly,false, 0);
        savedMovieRepository.save(savedMovie305);


        SavedMovie savedMovie306 = new SavedMovie(homeAlone, familyFriendly,false, 0);
        savedMovieRepository.save(savedMovie306);

        SavedMovie savedMovie307 = new SavedMovie(mixedTape, familyFriendly,false, 0);
        savedMovieRepository.save(savedMovie307);

        SavedMovie savedMovie308 = new SavedMovie(raya, familyFriendly,false, 0);
        savedMovieRepository.save(savedMovie308);

        SavedMovie savedMovie309 = new SavedMovie(frozen, familyFriendly,false, 0);
        savedMovieRepository.save(savedMovie309);

        SavedMovie savedMovie310 = new SavedMovie(frozen2, familyFriendly,false, 0);
        savedMovieRepository.save(savedMovie310);
        











    }


}