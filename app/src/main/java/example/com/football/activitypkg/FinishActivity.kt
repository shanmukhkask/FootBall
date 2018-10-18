package example.com.football.activitypkg

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import example.com.football.R
import example.com.football.modal.Player
import example.com.football.utilities.EXTRAPLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player= intent.getParcelableExtra<Player>(EXTRAPLAYER)

        searchLeagueText.text="Looking for ${player.league} ${player.skill} league near you..."
    }
}
