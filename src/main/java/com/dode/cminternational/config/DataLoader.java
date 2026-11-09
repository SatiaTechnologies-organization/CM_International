package com.dode.cminternational.config;

import com.dode.cminternational.model.BlogImage;
import com.dode.cminternational.model.BlogPost;
import com.dode.cminternational.repository.BlogPostRepository;
import com.dode.cminternational.repository.NewsPostRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.time.LocalDate;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner initDatabase(BlogPostRepository blogRepo, NewsPostRepository newsRepo) {
        return args -> {

            if (blogRepo.count() == 0) {
                // Post 1
                BlogPost p1 = new BlogPost();
                p1.setTitleEn("Impact Move 2026 – Children's leisure time of the sponsored children");
                p1.setTitleDe("Impact Move 2026 – Freizeit der Patenkinder");
                p1.setContentEn("From 24 to 27.02. we welcomed 28 sponsored children from CMI to the site and enjoy an inspiring and valuable free time together.");
                p1.setContentDe("Vom 24. bis 27.02. haben wir 28 Patenkinder von CMI bei uns auf dem Gelände begrüßt und eine inspirierende und wertvolle freie Zeit miteinander verbracht.");
                p1.setCategoryEn("EVENTS");
                p1.setCategoryDe("VERANSTALTUNGEN");
                p1.setDateCreated(LocalDate.of(2026, 3, 9));
                p1.setViews(39);
                p1.setLikes(7);

                BlogImage p1_img1 = new BlogImage();
                p1_img1.setImageUrl("/images/blog1.png");
                p1_img1.setDescriptionEn("Thematically, together with the children, we looked at the career of King David on the basis of pictures. The learned was then creatively solidified by the painting of coloring pages. In the afternoon, fun and romping were on the program. Whether it was a station game, ball games or a quiz show, the children enjoyed it to the fullest and constantly had a smile on their face.");
                p1_img1.setDescriptionDe("Thematisch haben wir uns anhand von Bildern mit dem Lebensweg von König David beschäftigt. Das Gelernte wurde dann kreativ durch das Ausmalen von Malvorlagen gefestigt. Am Nachmittag standen Spaß und Toben auf dem Programm. Ob Stationsspiel, Ballspiele oder Quizshow, die Kinder genossen es in vollen Zügen und hatten ständig ein Lächeln im Gesicht.");
                p1_img1.setBlogPost(p1);
                p1.getImages().add(p1_img1);

                BlogImage p1_img2 = new BlogImage();
                p1_img2.setImageUrl("/images/blog1-2.png");
                p1_img2.setDescriptionEn("In the morning, the godchildren were allowed to let their creativity run wild when designing cards. The children were very happy about the letters and gifts from Germany from the respective godparents!");
                p1_img2.setDescriptionDe("Vormittags durften die Patenkinder ihre Kreativität freien Lauf lassen beim Gestalten von Karten. Die Kinder haben sich sehr über die Briefe und Geschenke aus Deutschland von den jeweiligen Paten gefreut!");
                p1_img2.setBlogPost(p1);
                p1.getImages().add(p1_img2);

                BlogImage p1_img3 = new BlogImage();
                p1_img3.setImageUrl("/images/blog1-3.png");
                p1_img3.setDescriptionEn("Many thanks to all those who allow these children to gain access to good education and participate in blessed programs like this free time!");
                p1_img3.setDescriptionDe("Vielen vielen Dank an alle, die es diesen Kindern ermöglichen, Zugang zu guter Bildung zu erhalten und an gesegneten Programmen wie dieser Freizeit teilzunehmen!");
                p1_img3.setBlogPost(p1);
                p1.getImages().add(p1_img3);

                blogRepo.save(p1);

                // Post 2
                BlogPost p2 = new BlogPost();
                p2.setTitleEn("Impact Move 2026 – Habari!");
                p2.setTitleDe("Impact Move 2026 – Habari!");
                p2.setContentEn("We are part of Impact Move 2026 of the Liebenzell Mission Germany.");
                p2.setContentDe("Wir sind Teil von Impact Move 2026 der Liebenzell Mission Deutschland.");
                p2.setCategoryEn("EVENTS");
                p2.setCategoryDe("VERANSTALTUNGEN");
                p2.setDateCreated(LocalDate.of(2026, 2, 17));
                p2.setViews(62);
                p2.setLikes(13);

                BlogImage p2_img1 = new BlogImage();
                p2_img1.setImageUrl("/images/blog2.png");
                p2_img1.setDescriptionEn("In the first phase (Move-in) we were allowed to participate in a discipleship school in Canada and Germany for three months and grow personally as well as in the group in faith.\n\nFrom January, we will be able to immerse ourselves in a different culture during move-out in different teams and get a practical insight into the missionary work. We as Team Kenya (from left to right) Robert, Johanna, Rebecca, Elia, Simon and Jeremy) support the Christian Mission International for three months on the grounds of the Sambocho Health Centre in various areas.\n\nAs a team, we are very grateful to CMI as well as Patrick and Sabine Museve for the opportunity to get an insight into the valuable work.");
                p2_img1.setDescriptionDe("In der ersten Phase (Move-in) durften wir drei Monate lang an einer Jüngerschaftsschule in Kanada und Deutschland teilnehmen und persönlich sowie als Gruppe im Glauben wachsen.\n\nAb Januar dürfen wir im Move-out in verschiedenen Teams in eine andere Kultur eintauchen und einen praktischen Einblick in die Missionsarbeit gewinnen. Wir als Team Kenia (von links nach rechts Robert, Johanna, Rebecca, Elia, Simon und Jeremy) unterstützen die Christian Mission International für drei Monate auf dem Gelände des Sambocho Health Centre in verschiedenen Bereichen.\n\nAls Team sind wir CMI sowie Patrick und Sabine Museve sehr dankbar für die Möglichkeit, einen Einblick in die wertvolle Arbeit zu erhalten.");
                p2_img1.setBlogPost(p2);
                p2.getImages().add(p2_img1);

                blogRepo.save(p2);

                // Post 3
                BlogPost p3 = new BlogPost();
                p3.setTitleEn("A reason to celebrate");
                p3.setTitleDe("Ein Grund zu feiern");
                p3.setContentEn("");
                p3.setContentDe("");
                p3.setCategoryEn("TESTIMONY");
                p3.setCategoryDe("ZEUGNIS");
                p3.setDateCreated(LocalDate.of(2025, 11, 26));
                p3.setViews(26);
                p3.setLikes(7);

                BlogImage p3_img1 = new BlogImage();
                p3_img1.setImageUrl("/images/blog3.png");
                p3_img1.setDescriptionEn("Our godchild Brian became an orphan in elementary school. His father was shot dead during the land disputes that sparked a bloody conflict at Mount Elgon in 2007. The mother, a small farmer, has since had to take care of her ten children alone.");
                p3_img1.setDescriptionDe("Unser Patenkind Brian wurde in der Grundschule zur Waise. Sein Vater wurde 2007 bei den Landstreitigkeiten erschossen, die einen blutigen Konflikt am Mount Elgon auslösten. Die Mutter, eine Kleinbäuerin, musste seitdem ihre zehn Kinder alleine versorgen.");
                p3_img1.setBlogPost(p3);
                p3.getImages().add(p3_img1);

                BlogImage p3_img2 = new BlogImage();
                p3_img2.setImageUrl("/images/blog3-2.png");
                p3_img2.setDescriptionEn("With the help of a godfather in Germany, we were able to provide Brian and his sister Cynthia with a good school education and further support for the family. Brian was a hard-working student and qualified for a university degree. He now successfully completed this with a Bachelor in English. Brian is an English teacher for high school.\n\nAt the graduation ceremony at the university we were able to celebrate together with Brian's family!");
                p3_img2.setDescriptionDe("Mit Hilfe eines Paten in Deutschland konnten wir Brian und seiner Schwester Cynthia eine gute Schulausbildung und weitere Unterstützung für die Familie ermöglichen. Brian war ein fleißiger Schüler und qualifizierte sich für ein Universitätsstudium. Dieses hat er nun erfolgreich mit einem Bachelor in Englisch abgeschlossen. Brian ist Englischlehrer für die High School.\n\nBei der Abschlussfeier an der Universität konnten wir gemeinsam mit Brians Familie feiern!");
                p3_img2.setBlogPost(p3);
                p3.getImages().add(p3_img2);

                BlogImage p3_img3 = new BlogImage();
                p3_img3.setImageUrl("/images/blog3-3.png");
                p3_img3.setDescriptionEn("");
                p3_img3.setDescriptionDe("");
                p3_img3.setBlogPost(p3);
                p3.getImages().add(p3_img3);

                blogRepo.save(p3);

                // Post 4
                BlogPost p4 = new BlogPost();
                p4.setTitleEn("Orientation day for new sponsor children");
                p4.setTitleDe("Orientierungstag für neue Patenkinder");
                p4.setContentEn("Last week we invited 12 new godchildren and their guardians to us in Sambocho.");
                p4.setContentDe("Letzte Woche haben wir 12 neue Patenkinder und ihre Erziehungsberechtigten zu uns nach Sambocho eingeladen.");
                p4.setCategoryEn("COMMUNITY");
                p4.setCategoryDe("GEMEINDE");
                p4.setDateCreated(LocalDate.of(2025, 11, 26));
                p4.setViews(16);
                p4.setLikes(5);

                BlogImage p4_img1 = new BlogImage();
                p4_img1.setImageUrl("/images/blog4.png");
                p4_img1.setDescriptionEn("With the meeting, we wanted to create an opportunity to get to know each other better and to discuss the school future of the children. Some parents had a long journey of 20km. Others came from the immediate vicinity. The families have suffered a lot. The death of the mother or father, the loss of the...");
                p4_img1.setDescriptionDe("Mit dem Treffen wollten wir die Gelegenheit schaffen, sich besser kennenzulernen und die schulische Zukunft der Kinder zu besprechen. Einige Eltern hatten eine weite Anreise von 20 km. Andere kamen aus der unmittelbaren Umgebung. Die Familien haben viel Leid erfahren. Der Tod von Mutter oder Vater, der Verlust...");
                p4_img1.setBlogPost(p4);
                p4.getImages().add(p4_img1);

                BlogImage p4_img2 = new BlogImage();
                p4_img2.setImageUrl("/images/blog4-2.png");
                p4_img2.setDescriptionEn("From January, the children will be allowed to go to a new, good school. Some of the children are already in third grade. Unfortunately, they lack basic knowledge in reading, writing and arithmetic. In the new school, they will get help to close these learning gaps.");
                p4_img2.setDescriptionDe("Ab Januar dürfen die Kinder auf eine neue, gute Schule gehen. Einige der Kinder sind bereits in der dritten Klasse. Leider fehlen ihnen Grundkenntnisse im Lesen, Schreiben und Rechnen. In der neuen Schule werden sie Hilfe erhalten, um diese Lernlücken zu schließen.");
                p4_img2.setBlogPost(p4);
                p4.getImages().add(p4_img2);

                BlogImage p4_img3 = new BlogImage();
                p4_img3.setImageUrl("/images/blog4-3.png");
                p4_img3.setDescriptionEn("Orderly clothing, regular meals and a clean sleeping place have these children mostly not. Also there, the sponsorship will help to fulfill the needs of the children.\n\nIn addition to the biblical message that God wants to bring hope in a dark culture, the children were allowed to play and present themselves in their own writing. The parents were explained where CMI will offer help and for which areas they as parents remain responsible.\n\nAfter a common meal there was still a small food package for the families. In January we will see each other again - for the enrollment!");
                p4_img3.setDescriptionDe("Ordentliche Kleidung, regelmäßige Mahlzeiten und einen sauberen Schlafplatz haben diese Kinder überwiegend nicht. Auch da wird die Patenschaft helfen, die Bedürfnisse der Kinder besser zu stillen. Noch eher ernüchternden biblischen Botschaft, dass Gott in einer dunklen Kultur Hoffnung bringen möchte, durften die Kinder spielen und sich in einem Schreiben ihren Paten vorstellen. Den Eltern wurde erklärt, wo CMI Hilfe bieten wird und für welche Bereiche sie als Eltern weiterhin zuständig sind.\n\nNach einem gemeinsamen Essen gab es noch ein kleines Lebensmittelpaket für die Familien. Im Januar sehen wir uns dann wieder - zur Einschulung!");
                p4_img3.setBlogPost(p4);
                p4.getImages().add(p4_img3);

                BlogImage p4_img4 = new BlogImage();
                p4_img4.setImageUrl("/images/blog4-4.png");
                p4_img4.setDescriptionEn("");
                p4_img4.setDescriptionDe("");
                p4_img4.setBlogPost(p4);
                p4.getImages().add(p4_img4);

                blogRepo.save(p4);

                // Post 5
                BlogPost p5 = new BlogPost();
                p5.setTitleEn("Stone on Stone – Construction Site Update Springs of Hope");
                p5.setTitleDe("Stein auf Stein – Baustellen-Update Springs of Hope");
                p5.setContentEn("Our \"CMI Springs of Hope Retreat Centre\" is growing so slowly. The wall work is almost complete. Next part is a roof! See for yourself how the \"picture-by-picture\" building goes up.");
                p5.setContentDe("Unser \"CMI Springs of Hope Retreat Centre\" wächst so langsam. Die Mauerarbeiten sind fast abgeschlossen. Der nächste Teil ist ein Dach! Überzeugen Sie sich selbst, wie der Bau \"Bild für Bild\" vorangeht.");
                p5.setCategoryEn("PROJECTS");
                p5.setCategoryDe("PROJEKTE");
                p5.setDateCreated(LocalDate.of(2025, 11, 17));
                p5.setViews(37);
                p5.setLikes(6);

                BlogImage p5_img1 = new BlogImage();
                p5_img1.setImageUrl("/images/blog5.png");
                p5_img1.setDescriptionEn("");
                p5_img1.setDescriptionDe("");
                p5_img1.setBlogPost(p5);
                p5.getImages().add(p5_img1);

                BlogImage p5_img2 = new BlogImage();
                p5_img2.setImageUrl("/images/blog5-2.png");
                p5_img2.setDescriptionEn("");
                p5_img2.setDescriptionDe("");
                p5_img2.setBlogPost(p5);
                p5.getImages().add(p5_img2);

                BlogImage p5_img3 = new BlogImage();
                p5_img3.setImageUrl("/images/blog5-3.png");
                p5_img3.setDescriptionEn("");
                p5_img3.setDescriptionDe("");
                p5_img3.setBlogPost(p5);
                p5.getImages().add(p5_img3);

                BlogImage p5_img4 = new BlogImage();
                p5_img4.setImageUrl("/images/blog5-4.png");
                p5_img4.setDescriptionEn("");
                p5_img4.setDescriptionDe("");
                p5_img4.setBlogPost(p5);
                p5.getImages().add(p5_img4);

                BlogImage p5_img5 = new BlogImage();
                p5_img5.setImageUrl("/images/blog5-5.png");
                p5_img5.setDescriptionEn("");
                p5_img5.setDescriptionDe("");
                p5_img5.setBlogPost(p5);
                p5.getImages().add(p5_img5);

                BlogImage p5_img6 = new BlogImage();
                p5_img6.setImageUrl("/images/blog5-6.png");
                p5_img6.setDescriptionEn("");
                p5_img6.setDescriptionDe("");
                p5_img6.setBlogPost(p5);
                p5.getImages().add(p5_img6);

                BlogImage p5_img7 = new BlogImage();
                p5_img7.setImageUrl("/images/blog5-7.png");
                p5_img7.setDescriptionEn("");
                p5_img7.setDescriptionDe("");
                p5_img7.setBlogPost(p5);
                p5.getImages().add(p5_img7);

                blogRepo.save(p5);

                // Post 6
                BlogPost p6 = new BlogPost();
                p6.setTitleEn("Reading glasses for those who need one");
                p6.setTitleDe("Lesebrillen für alle, die eine brauchen");
                p6.setContentEn("Through our umbrella organization CHAK we participate in the “Africa Clear Sight” project. We are provided with reading glasses free of charge, which we then pass on to the people of Mount Elgon who need one. These are predominantly older people whose work force is restricted and which are therefore becoming increasingly poor. Getting reading glasses for free is therefore a great gift.");
                p6.setContentDe("Durch unsere Schirmorganisation CHAK machen wir mit beim “Africa Clear Sight” Projekt. Wir bekommen Lesebrillen kostenfrei zur Verfügung gestellt, die wir dann an die Menschen am Mount Elgon weitergeben, die eine brauchen. Das sind überwiegend ältere Menschen, deren Arbeitskraft eingeschränkt ist und die dadurch zunehmend verarmen. Eine Lesebrille kostenlos zu bekommen, ist daher ein großes Geschenk.");
                p6.setCategoryEn("HEALTH");
                p6.setCategoryDe("GESUNDHEIT");
                p6.setDateCreated(LocalDate.of(2025, 11, 2));
                p6.setViews(20);
                p6.setLikes(7);

                BlogImage p6_img1 = new BlogImage();
                p6_img1.setImageUrl("/images/blog6.png");
                p6_img1.setDescriptionEn("This week we invited again to our “eye clinic”. We also take this as an opportunity to carry out blood pressure and blood sugar tests and thus find patients who need a treatment but do not currently receive it.");
                p6_img1.setDescriptionDe("Diese Woche haben wir wieder zu unserer „Augenklinik“ eingeladen. Das nehmen wir auch zum Anlass, um Blutdruck- und Blutzuckertests durchzuführen und so Patienten zu finden, die eine Behandlung brauchen, aber derzeit nicht erhalten.");
                p6_img1.setBlogPost(p6);
                p6.getImages().add(p6_img1);

                BlogImage p6_img2 = new BlogImage();
                p6_img2.setImageUrl("/images/blog6-2.png");
                p6_img2.setDescriptionEn("And for the “early birds” it has as a surprise a Bible in Swahili as a gift, so that they actually have something to read with their new glasses!");
                p6_img2.setDescriptionDe("Und für die „Early Birds“ gab es als Überraschung eine Bibel in Swahili als Geschenk, damit sie mit ihrer neuen Brille auch tatsächlich etwas zu lesen haben!");
                p6_img2.setBlogPost(p6);
                p6.getImages().add(p6_img2);

                BlogImage p6_img3 = new BlogImage();
                p6_img3.setImageUrl("/images/blog6-3.png");
                p6_img3.setDescriptionEn("");
                p6_img3.setDescriptionDe("");
                p6_img3.setBlogPost(p6);
                p6.getImages().add(p6_img3);

                blogRepo.save(p6);

                // Post 7
                BlogPost p7 = new BlogPost();
                p7.setTitleEn("Kapsokwony Community Run 22.10.25");
                p7.setTitleDe("Kapsokwony Community Run 22.10.25");
                p7.setContentEn("");
                p7.setContentDe("");
                p7.setCategoryEn("COMMUNITY");
                p7.setCategoryDe("GEMEINDE");
                p7.setDateCreated(LocalDate.of(2025, 10, 25));
                p7.setViews(19);
                p7.setLikes(6);

                BlogImage p7_img1 = new BlogImage();
                p7_img1.setImageUrl("/images/blog7.png");
                p7_img1.setDescriptionEn("A youth organization recently invited to a running competition. Among other things, attention should be drawn to the situation of girls at Mount Elgon. The number of pregnancies in teenagers is high. Many girls therefore break off their school careers. Through our sponsorship program, we help girls get a perspective for their lives and support them in their schooling.");
                p7_img1.setDescriptionDe("Eine Jugendorganisation hat kürzlich zu einem Laufwettbewerb eingeladen. Unter anderem soll auf die Situation von Mädchen am Mount Elgon aufmerksam gemacht werden. Die Zahl der Schwangerschaften bei Teenagern ist hoch. Viele Mädchen brechen daher ihre Schullaufbahn ab. Durch unser Patenschaftsprogramm helfen wir Mädchen, eine Perspektive für ihr Leben zu bekommen, und unterstützen sie in ihrer Schulbildung.");
                p7_img1.setBlogPost(p7);
                p7.getImages().add(p7_img1);

                BlogImage p7_img2 = new BlogImage();
                p7_img2.setImageUrl("/images/blog7-2.png");
                p7_img2.setDescriptionEn("In the running competition, the employees of our health center were allowed to provide first aid in the case of minor injuries or circulatory problems. We did blood pressure checks for the spectators and a staff member ventured into the race with the pros.");
                p7_img2.setDescriptionDe("Beim Laufwettbewerb durften die Mitarbeiter unseres Gesundheitszentrums bei kleineren Verletzungen oder Kreislaufproblemen Erste Hilfe leisten. Wir haben Blutdruckkontrollen für die Zuschauer durchgeführt und ein Mitarbeiter hat sich mit den Profis ins Rennen gewagt.");
                p7_img2.setBlogPost(p7);
                p7.getImages().add(p7_img2);

                BlogImage p7_img3 = new BlogImage();
                p7_img3.setImageUrl("/images/blog7-3.png");
                p7_img3.setDescriptionEn("");
                p7_img3.setDescriptionDe("");
                p7_img3.setBlogPost(p7);
                p7.getImages().add(p7_img3);

                blogRepo.save(p7);

                // Post 8
                BlogPost p8 = new BlogPost();
                p8.setTitleEn("Construction project Springs of Hope");
                p8.setTitleDe("Bauprojekt Springs of Hope");
                p8.setContentEn("COMING PROJECT “CMI SPRINGS OF HOPE RETREAT CENTRE”");
                p8.setContentDe("KOMMENDES PROJEKT “CMI SPRINGS OF HOPE RETREAT CENTRE”");
                p8.setCategoryEn("PROJECTS");
                p8.setCategoryDe("PROJEKTE");
                p8.setDateCreated(LocalDate.of(2025, 10, 25));
                p8.setViews(22);
                p8.setLikes(3);

                BlogImage p8_img1 = new BlogImage();
                p8_img1.setImageUrl("/images/blog8.png");
                p8_img1.setDescriptionEn("In the village of Rokocho in Kerio Valley, CMI bought a plot of land some time ago.\nWe want to build a holiday home for the godchildren from the Pokot tribe, where they have a protected place to recover during the holidays. In their home village in Pokot, children are exposed to extreme poverty, hunger and cultural practices such as forced circumcision.\nConstruction work was finally started a few weeks ago. At the groundbreaking ceremony, the board members of CMI Kenya travelled to ask for God's blessings for the construction work together with representatives of the local church and the village community.");
                p8_img1.setDescriptionDe("Im Dorf Rokocho im Kerio Valley hat CMI vor einiger Zeit ein Grundstück gekauft.\nWir wollen ein Ferienhaus für die Patenkinder vom Pokot-Stamm bauen, in dem sie in den Ferien einen geschützten Ort zur Erholung haben. In ihrem Heimatdorf in Pokot sind die Kinder extremer Armut, Hunger und kulturellen Praktiken wie Zwangsbeschneidung ausgesetzt.\nDie Bauarbeiten wurden schließlich vor einigen Wochen begonnen. Bei der Grundsteinlegung reisten die Vorstandsmitglieder von CMI Kenia an, um gemeinsam mit Vertretern der lokalen Kirche und der Dorfgemeinschaft um Gottes Segen für die Bauarbeiten zu bitten.");
                p8_img1.setBlogPost(p8);
                p8.getImages().add(p8_img1);

                BlogImage p8_img2 = new BlogImage();
                p8_img2.setImageUrl("/images/blog8-2.png");
                p8_img2.setDescriptionEn("Despite extreme heat and bad roads making transportation difficult, we are pleased that the foundation of the building has now been completed.\nAs long as the house is not yet finished, we use employees alternative housing options such as camping to be able to accompany the construction work.");
                p8_img2.setDescriptionDe("Trotz extremer Hitze und schlechter Straßen, die den Transport erschweren, freuen wir uns, dass das Fundament des Gebäudes nun fertiggestellt ist.\nSolange das Haus noch nicht fertig ist, nutzen wir für Mitarbeiter alternative Unterbringungsmöglichkeiten wie das Camping, um die Bauarbeiten begleiten zu können.");
                p8_img2.setBlogPost(p8);
                p8.getImages().add(p8_img2);

                BlogImage p8_img3 = new BlogImage();
                p8_img3.setImageUrl("/images/blog8-3.png");
                p8_img3.setDescriptionEn("");
                p8_img3.setDescriptionDe("");
                p8_img3.setBlogPost(p8);
                p8.getImages().add(p8_img3);

                blogRepo.save(p8);

                // Post 9 (WITH VIDEOS)
                BlogPost p9 = new BlogPost();
                p9.setTitleEn("Impact Move 2025 - GOOD NEWS CLUB");
                p9.setTitleDe("Impact Move 2025 - GOOD NEWS CLUB");
                p9.setContentEn("On Saturday, one of the weekly highlights will take place in the afternoon. The Good News Club. What started with a few children at the off-road fence is now a kids club with often over 100 children. That sounds incredible - eat it too!");
                p9.setContentDe("Am Samstag findet am Nachmittag eines der wöchentlichen Highlights statt. Der Good News Club. Was mit ein paar Kindern am Offroad-Zaun begann, ist heute ein Kinderclub mit oft über 100 Kindern. Das klingt unglaublich - ist es auch!");
                p9.setCategoryEn("FAITH");
                p9.setCategoryDe("GLAUBE");
                p9.setDateCreated(LocalDate.of(2025, 5, 4));
                p9.setViews(35);
                p9.setLikes(10);

                BlogImage p9_img1 = new BlogImage();
                p9_img1.setImageUrl("/images/blog9.png");
                p9_img1.setDescriptionEn("The highest we had was more than 130 children. And we never advertised it. God has entrusted the children to us, gives us strength and ideas for the club and trusts us a lot. After some children ask the fence two hours before when the club starts, the security guard opens the gates from 17:00 and the children storm into the grounds in droves.");
                p9_img1.setDescriptionDe("Das höchste, was wir hatten, waren mehr als 130 Kinder. Und wir haben nie dafür geworben. Gott hat uns die Kinder anvertraut, gibt uns Kraft und Ideen für den Club und vertraut uns viel zu. Nachdem einige Kinder zwei Stunden vor Beginn des Clubs am Zaun fragen, öffnet der Sicherheitsdienst ab 17:00 Uhr die Tore und die Kinder strömen in Scharen auf das Gelände.");
                p9_img1.setBlogPost(p9);
                p9.getImages().add(p9_img1);

                // Video 1
                BlogImage p9_vid1 = new BlogImage();
                p9_vid1.setVideoUrl("https://www.youtube.com/embed/YOUR_YOUTUBE_VIDEO_ID_1");
                p9_vid1.setDescriptionEn("We start with football, volleyball, Frisbee, ... then they go to paint, we dance or play other games.");
                p9_vid1.setDescriptionDe("Wir beginnen mit Fußball, Volleyball, Frisbee, ... dann gehen sie malen, wir tanzen oder spielen andere Spiele.");
                p9_vid1.setBlogPost(p9);
                p9.getImages().add(p9_vid1);

                // Video 2
                BlogImage p9_vid2 = new BlogImage();
                p9_vid2.setVideoUrl("https://www.youtube.com/embed/YOUR_YOUTUBE_VIDEO_ID_2");
                p9_vid2.setDescriptionEn("Having all the children in view with such a large group is not so easy, but the four of us split up and then it always works quite well. Fortunately, we also have support from Stephen (CMI employees), who also translates for us. Towards the end we sing English movement children's songs, which makes young and old great joy. After that, we usually play a Bible story as a theater and then summarize what this means for the children personally.");
                p9_vid2.setDescriptionDe("Bei so einer großen Gruppe alle Kinder im Blick zu haben, ist nicht so einfach, aber wir vier teilen uns auf und dann klappt es immer ganz gut. Zum Glück haben wir auch Unterstützung von Stephen (CMI-Mitarbeiter), der auch für uns übersetzt. Gegen Ende singen wir englische Bewegungs-Kinderlieder, was Jung und Alt große Freude bereitet. Danach spielen wir meistens eine biblische Geschichte als Theater und fassen dann zusammen, was das für die Kinder persönlich bedeutet.");
                p9_vid2.setBlogPost(p9);
                p9.getImages().add(p9_vid2);

                // Image 2
                BlogImage p9_img2 = new BlogImage();
                p9_img2.setImageUrl("/images/blog9-2.png");
                p9_img2.setDescriptionEn("After prayer, a final song and our farewell call \"Jesus loves me, Jesus loves you, Jesus loves us, GOOD NEWS CLUB\" is our Kenyan young group over again. At the gate above, individual kids \"kwa heri\" (bye) is said and \"Asiku mwema\" (Good night) is desired.\nAfter that we are always a little done, but filled with great joy and gratitude - the children are a blessing!\nNow since we've been gone, it's questionable how or if a GNC can continue. Pray that Jesus will continue to work in every child and that seeds sown in the GNC may grow in the hearts!");
                p9_img2.setDescriptionDe("Nach dem Gebet, einem Abschlusslied und unserem Abschiedsruf \"Jesus loves me, Jesus loves you, Jesus loves us, GOOD NEWS CLUB\" ist unsere kenianische Jugendgruppe wieder vorbei. Am Tor oben wird einzelnen Kindern \"kwa heri\" (tschüss) gesagt und \"Asiku mwema\" (Gute Nacht) gewünscht.\nDanach sind wir immer ein bisschen fertig, aber erfüllt von großer Freude und Dankbarkeit - die Kinder sind ein Segen!\nJetzt, wo wir weg sind, ist es fraglich, wie oder ob ein GNC weitergehen kann. Betet, dass Jesus weiterhin in jedem Kind wirkt und dass die im GNC gesäten Samen in den Herzen wachsen können!");
                p9_img2.setBlogPost(p9);
                p9.getImages().add(p9_img2);

                blogRepo.save(p9);

                // Post 10 (WITH VIDEO AT THE END)
                BlogPost p10 = new BlogPost();
                p10.setTitleEn("Impact Move 2025 – Visit to the Pokot tribe");
                p10.setTitleDe("Impact Move 2025 – Besuch beim Pokot-Stamm");
                p10.setContentEn("");
                p10.setContentDe("");
                p10.setCategoryEn("PROJECTS");
                p10.setCategoryDe("PROJEKTE");
                p10.setDateCreated(LocalDate.of(2025, 4, 5));
                p10.setViews(34);
                p10.setLikes(7);

                BlogImage p10_img1 = new BlogImage();
                p10_img1.setImageUrl("/images/blog10.png");
                p10_img1.setDescriptionEn("From 20.03. to 24.03. we were allowed to go to Pokot as an impact team together with Patrick for 3 days. There was many things very different: the landscape, the people and their culture. Although the Pokots are partly known as \"bad people\", we have perceived them very differently, namely super warm, generous and hospitable!");
                p10_img1.setDescriptionDe("Vom 20.03. bis 24.03. durften wir als Impact-Team zusammen mit Patrick für 3 Tage nach Pokot fahren. Da war wieder vieles ganz anders: die Landschaft, die Menschen und ihre Kultur. Obwohl die Pokots teilweise als \"böse Menschen\" bekannt sind, haben wir sie ganz anders wahrgenommen, nämlich super herzlich, großzügig und gastfreundlich!");
                p10_img1.setBlogPost(p10);
                p10.getImages().add(p10_img1);

                BlogImage p10_img2 = new BlogImage();
                p10_img2.setImageUrl("/images/blog10-2.png");
                p10_img2.setDescriptionEn("We met James and Caro, the missionaries in Pokot. Great people who do two and their work there is so important and valuable! They have already founded 4 churches and have 12 children from there in the sponsorship program.");
                p10_img2.setDescriptionDe("Wir haben James und Caro kennengelernt, die Missionare in Pokot. Tolle Leute, die zwei machen und ihre Arbeit dort so wichtig und wertvoll ist! Sie haben bereits 4 Gemeinden gegründet und 12 Kinder von dort im Patenschaftsprogramm.");
                p10_img2.setBlogPost(p10);
                p10.getImages().add(p10_img2);

                BlogImage p10_img3 = new BlogImage();
                p10_img3.setImageUrl("/images/blog10-3.png");
                p10_img3.setDescriptionEn("Together we were out and about in the village and used situations to tell people about the gospel, to encourage them or to pray together. For example, at the watering hole or at families at home.\nWe were able to see how a young man, who also has a high position in the village, chose Jesus and came to the church for the first time on Sunday!\nIn addition, we have done a small children's program with over 200 children. Many of the children do not get something to eat every day, so there was Githeri (corn and beans) for each child afterwards. There they walked around partly jumping with joy with their plate.\nWe also had two movie nights, which more than 300 people came to, because of course this was a big highlight for them!");
                p10_img3.setDescriptionDe("Gemeinsam waren wir im Dorf unterwegs und haben Situationen genutzt, um den Menschen das Evangelium zu erzählen, sie zu ermutigen oder gemeinsam zu beten. Zum Beispiel an der Wasserstelle oder bei Familien zuhause.\nDabei durften wir erleben, wie ein junger Mann, der auch eine hohen Stellung im Dorf hat, sich für Jesus entschieden hat und am Sonntag dann auch zum ersten Mal in die Kirche kam!\nAußerdem haben wir einen kleinen Kindergarten mit über 200 Kindern gemacht. Viele der Kinder bekommen nicht jeden Tag was zu essen, deshalb gab es danach noch Githeri (Mais und Bohnen) für jedes Kind. Da sind sie teilweise hilfend vor Freude mit ihrem Teller rumgelaufen.\nWir hatten auch zwei Filmabende, zu denen über 300 Menschen kamen, weil das natürlich ein ganz großes Highlight für sie war!");
                p10_img3.setBlogPost(p10);
                p10.getImages().add(p10_img3);

                BlogImage p10_img4 = new BlogImage();
                p10_img4.setImageUrl("/images/blog10-4.png");
                p10_img4.setDescriptionEn("On Sunday we were allowed to be in the service and experience how happy the pokots sing, dance and even jump vigorously for praise!");
                p10_img4.setDescriptionDe("Am Sonntag durften wir im Gottesdienst dabei sein und erleben wie fröhlich die Pokots zum Lobpreis singen, tanzen und sogar kräftig springen!");
                p10_img4.setBlogPost(p10);
                p10.getImages().add(p10_img4);

                // Video
                BlogImage p10_vid1 = new BlogImage();
                p10_vid1.setVideoUrl("https://www.youtube.com/embed/YOUR_YOUTUBE_VIDEO_ID_3");
                p10_vid1.setDescriptionEn("Afterwards we had the opportunity to meet in women's and men's rounds and answer questions about the faith but also about life in Germany.\nWe also encouraged her to send her children to school. Most people want their children to stay at home and take care of the animals. The girls are married very early (at about 12 years), circumcised and then soon get pregnant. Before that, Caro and James try to preserve the girls by being able to get out of the environment and go to school through the sponsorship program.\n\nIt was a very nice and blessed time for us and we were able to gain many impressions and experiences!");
                p10_vid1.setDescriptionDe("Danach hatten wir noch die Möglichkeit uns in Frauen- und Männerrunden zu treffen und Fragen zum Glauben oder auch zum Leben in Deutschland beantworten.\nWir haben sie auch ermutigt ihre Kinder zur Schule zu schicken. Die meisten wollen nämlich, dass ihre Kinder zuhause bleiben und sich um die Tiere kümmern. Die Mädchen werden schon sehr früh (mit ca. 12 Jahren) verheiratet, beschneiden und werden dann bald schwanger. Davor versuchen Caro und James die Mädchen zu bewahren, indem sie durch das Patenschaftsprogramm aus dem Umfeld herausholen und zur Schule gehen können.\n\nEs war eine sehr schöne und gesegnete Zeit für uns und wir durften viele Eindrücke und Erfahrungen sammeln!");
                p10_vid1.setBlogPost(p10);
                p10.getImages().add(p10_vid1);

                blogRepo.save(p10);
                System.out.println("✅ Database seeded with the 10 full articles from the screenshots!");
            }
            if (newsRepo.count() == 0) {
            }
        };
    }
}