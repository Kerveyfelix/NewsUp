package project.dheeraj.newsup2.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.analytics.FirebaseAnalytics
import project.dheeraj.newsup2.R

class TopStoriesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_top_stories_activity)

        val firebaseAnalytics = FirebaseAnalytics.getInstance(this)


    }
}
