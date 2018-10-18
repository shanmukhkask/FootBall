package example.com.football.activitypkg

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import example.com.football.R
import example.com.football.modal.Player
import example.com.football.utilities.EXTRAPLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {
    var player=Player("","")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun menOnClick(view: View)
    {
        womenBtn.isChecked=false
        coEdBtn.isChecked=false
        player.league="Mens"
    }
    fun womenOnclick(view: View)
    {
        menBtn.isChecked=false
        coEdBtn.isChecked=false
        player.league="Womens"
    }
    fun coEdOnClick(view: View)
    {
        womenBtn.isChecked=false
        menBtn.isChecked=false
        player.league="Co-Ed"
    }
    fun leagueNextClick(view:View)
    {
        if (player.league != "") {
            val intent=(Intent(this, SkillActivity::class.java))
            intent.putExtra(EXTRAPLAYER,player)
            startActivity(intent)
        }
        else {
            Toast.makeText(this,"No one is selected", Toast.LENGTH_SHORT).show()
        }

    }

}
