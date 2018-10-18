package example.com.football.activitypkg

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import example.com.football.R
import example.com.football.utilities.EXTRA_LEAGUE
import example.com.football.utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league= intent.getStringExtra(EXTRA_LEAGUE)
        val skill=intent.getStringExtra(EXTRA_SKILL)
        searchLeagueText.text="Looking for $league $skill league near you..."
    }
}
