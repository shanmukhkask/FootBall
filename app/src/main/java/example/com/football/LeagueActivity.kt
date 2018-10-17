package example.com.football

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }
    fun leagueNextClick(view:View)
    {
        if (selectedLeague!="")
        {
            var intent=(Intent(this,SkillActivity::class.java))
            intent.putExtra(EXTRA_LEAGUE,selectedLeague)
            startActivity(intent)
        }
        else
        {
            Toast.makeText(this,"No one is selected",Toast.LENGTH_SHORT).show()
        }

    }
    fun menOnClick(view: View)
    {
        womenBtn.isChecked=false
        coEdBtn.isChecked=false
        selectedLeague="mens"
    }
    fun womenOnclick(view: View)
    {
        menBtn.isChecked=false
        coEdBtn.isChecked=false
        selectedLeague="womens"
    }
    fun coEdOnClick(view: View)
    {
        womenBtn.isChecked=false
        menBtn.isChecked=false
        selectedLeague="Co-Ed"
    }

}
