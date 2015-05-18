package com.electricdroid.renaissance.splash;

import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;

/**
 * Created by anki on 16-02-2015.
 */
public class LanGaming extends SplashEvent {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        venue = Html.fromHtml("<b>Venue</b><p>CP- 8, 9<br>18th,19th,20th March 2015<br>11:30 AM -8:30 PM</p>");
        coordinatorNames = SpannableStringBuilder.valueOf("Kartik Anand\n" +
                "Abhishek Baj\n" +
                "Dheeraj\n" +
                "Prashant\n" +
                "Adil Khan");
        details = Html.fromHtml("<b>Details</b><p>We thinks for a Games Lover, No description is required about Lan Gaming.</p>"+
                "<b>1st Prize:</b>" + "<p>CS – 6000₹<br>DOTA - 3000₹ + 5 MTS HomeSpot WiFi Dongle<br>FIFA-1000₹ + 1 MTS HomeSpot WiFi Dongle<br>NFS-2000₹</p>" +
                "<b>2nd Prize:</b>" + "<p>CS –4,000₹<br>DOTA – 2,000₹ + 5 MTS HomeSpot WiFi Dongle<br>FIFA – 1 MTS HomeSpot WiFi Dongle<br>NFS – 1 MTS HomeSpot WiFi Dongle</p>" );
        rules = Html.fromHtml("<b>Rules</b><p><b>A. COUNTER STRIKE 1.6</b><br>" +
                "<br>" +
                "1. Maps: de_inferno, de_dust2, de_nuke, de_train ,de _tuscan<br>" +
                "<br>" +
                "2. Players: 5 vs. 5<br>" +
                "<br>" +
                "3. In early rounds One map will be played.<br>" +
                "<br>" +
                "4. Rounds per map: 30<br>" +
                "<br>" +
                "5. Winning: The first clan that has 16 rounds has won the match.<br>" +
                "<br>" +
                "6. Team switch at 15 rounds<br>" +
                "<br>" +
                "7. Time per round: 1:45 minutes<br>" +
                "<br>" +
                "8. Version: The Contest will be played with protocol 48 of Counter Strike (1.6)<br>" +
                "<br>" +
                "9. Players: Only players that are registered on the team are allowed to play.<br>" +
                "<br>" +
                "10.Tie: If there is a tie (15 - 15) in rounds, then rule of overtime will be applicable with starting money as $5000<br>" +
                "<br>" +
                "11.Cheating: Any form of cheating or exploitation of bugs is not allowed. If cheating is detected that team will be disqualified from the entire competition. If a team is in any way interfering with another team while they play or prepare to the game they will be disqualified.<br>" +
                "<br>" +
                "12. You must not abuse any game bugs. Breaking this rule will result as ban from tournament.<br>" +
                "<br>" +
                "13. Using any kind of hacks, especially custom kick or maphack will result as permanent ban from tournament. If a player is suspected for maphack, he must instantly take a screenshot. Same does accuser.<br>" +
                "<br>" +
                "14. Backdooring and creep skipping (luring creeps to outside the lane path) • Creep skipping is allowed for the outside 2 towers in each lane. • When your creeps die once you are pushing inside the base or while you were attacking the first or second lane-towers, you are allowed to continue attacking the building. • Once your creeps have entered the base, you are allowed to attack ANY building inside your opponent's base. • Blocking creeps is only allowed by using your own hero model. Casting spells like Earth shaker’s Fissure or Prophet’s Sprout in order to block your creeps is not allowed. Furthermore, you’re not allowed to seal your base entry with the help of any spells.<br>" +
                "<br>" +
                "15. Going 'afk' during game is not allowed.<br>" +
                "<br>" +
                "16. You are allowed to pick up/destroy enemy items you may eventually find lying on the ground (including items from killed courier).<br>" +
                "<br>" +
                "17. You are not allowed to ruin games intentionally. I.e. suiciding, selling all/dropping items etc.<br>" +
                "<br>" +
                "18. Intentional leaving (e.g. after several deaths in a row) will be considered as forfeiting.<br>" +
                "<br>" +
                "19. Forfeiting is allowed. To do so, the player must write 'gg' in 'All' chat and then he may leave the game.<br>" +
                "<br>" +
                "20. Remaking is allowed if someone gets dropped/disconnected in the first 15 minutes of play. Same for extreme lag/delay, this doesn’t let to play normal game. To do so, the player must inform your opponent in 'All' chat about the circumstances before leaving the game, otherwise he will be subjected to rule 7. If First blood was given before this time, case will be analyzed deeply.<br>" +
                "<br>" +
                "21. Bad manners/disturbing your opponent in 'All' chat is strictly forbidden, and may be punished as a disqualification or ban from tournament.<br>" +
                "<br>" +
                "<b>B. NEED FOR SPEED (Most Wanted) :</b><br>" +
                "<br>" +
                "Game Version Need For Speed™: Most Wanted General : Competition Mode: 4 vs. 4, Game Type: Circuit/Sprint/Knock Out, Car Settings, No sort of Upgrades are allowed. (it include visual performance and all) Junkman is not allowed, Personal save files are NOT allowed.<br>" +
                "<br>" +
                "Courses :<br>" +
                "<br>" +
                "RANDOM, Race Mode Options: Circuit/sprint,Track Direction: Forward/reverse, LAPS : At the discretion of organizing committee, N20 : Off, Collision Detection: Off, Performance Matching: ON, Min Num. Players: 4/4 Player Options: Units: Player’s own discretion, Car Damage: Off, Rear view Mirror: Player’s own discretion.<br>" +
                "<br>" +
                "Disconnections: (Any disconnection of the connection between match players due to System, Network, PC, and/or Power problems/issues) Intentional: Upon judgment by the referee, any offending player will be charged with a loss by forfeit. Unintentional: If the disconnection is deemed to be unintentional by the referee, the match will be restarted. If any player does not agree to a match restart, that player will lose by default.<br>" +
                "<br>" +
                "Penalty for Unfair Play Unfair Play: Use of any Cheat program Intentional disconnection Use of any settings exceeding standard and permitted settings If the match is disrupted due to unnecessary chatting, the player may be given a warning or lose by default at the referee’s sole discretion. Upon discovery of any player committing any violations regarded as unfair play, that player will be disqualified from the tournament. During the course of any match, the operations staff and/or referee may determine other actions to be unfair play at any time. Two warnings constitute being disqualified from the tournament. These rules are subject to modification by organizing committee’s own discretion.<br>" +
                "<b> C. FIFA 10 :</b><br>" +
                "<br>" +
                "Round 1: Any 3 star teams from International.<br>" +
                "<br>" +
                "Round 2 : Any 4 star teams from International or any other League.<br>" +
                "<br>" +
                "Game Settings: Half time - 6min, Game speed - fast, Off sides and injuries will be on.<br>" +
                "<br>" +
                "<b>D. DOTA 2 :</b><br>" +
                "<br>" +
                "You must not abuse any game bugs. Breaking this rule will result as ban from tournament.<br>" +
                "<br>" +
                "Using any kind of hacks, especially custom kick or maphack will result as permanent ban from tournament. If a player is suspected for maphack, he must instantly make a screenshot. Same does accuser.<br>" +
                "<br>" +
                "Backdooring and creep skipping (luring creeps to outside the lane path), Creep skipping is allowed for the outside 2 towers in each lane. When your creeps die once you are pushing inside the base or while you were attacking the first or second lane-towers, you are allowed to continue attacking the building. Once your creeps have entered the base, you are allowed to attack ANY building inside your opponent's base. Blocking creeps is only allowed by using your own hero model. Casting spells like Earth shaker’s Fissure or Prophet’s Sprout in order to block your creeps is not allowed. Furthermore, you’re not allowed to seal your base entry with the help of any spells.<br>" +
                "<br>" +
                "Going 'afk' during game is not allowed.<br>" +
                "<br>" +
                "You are allowed to pick up/destroy enemy items you may eventually find lying on the ground (including items from killed courier).<br>" +
                "<br>" +
                "You are not allowed to ruin games intentionally. I.e. suiciding, selling all/dropping items etc.<br>" +
                "<br>" +
                "Intentional leaving (e.g. after several deaths in a row) will be considered as forfeiting.<br>" +
                "<br>" +
                "Forfeiting is allowed. To do so, the player must write 'gg' in 'All' chat and then he may leave the game.<br>" +
                "<br>" +
                "Remaking is allowed if someone gets dropped/disconnected in the first 15 minutes of play.<br>" +
                "<br>" +
                "Same for extreme lag/delay, this doesn’t let to play normal game. To do so, the player must inform your opponent in 'All' chat about the circumstances before leaving the game, otherwise he will be subjected to rule.<br>" +
                "<br>" +
                "If First blood was given before this time, case will be analyzed deeply.<br>" +
                "<br>" +
                "Bad manners/disturbing your opponent in 'All' chat is strictly forbidden, and may be punished as a disqualification or ban from tournament.<br>" +
                "<br>" +
                "NOTE: All the participants are requested to bring their COLLEGE IDENTITY and ONE PASSPORT SIZE PHOTOGRAPH of each team member for registration. No candidate will be allowed to participate without above mentioned.</p>");
        registration = Html.fromHtml("<b>Registration Fee</b><p>CS – 500₹<br>DOTA – 500₹<br>" +
                "FIFA – 200₹<br>NFS - 100₹</p>");


        phn1 = "7742124647";
        coordinator1Name = "Kartik Anand";
        coordinator2Name = "Abhishek Baj";
        phn2 = "9828493487";
        setDetailsText(); //here it needs to b called to update details fragment otw it will b blank,because super class oncreate is called before
        //even intializing the details spanned text.
    }
}
