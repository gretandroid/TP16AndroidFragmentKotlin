package education.cccp.mobile.fragment

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import education.cccp.mobile.fragment.R.layout.fragment_first


class FirstFragment : Fragment() {

    private lateinit var activity: Activity

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(
            fragment_first,
            container,
            false
        )
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        activity = context as Activity
        FirstFragment::class.java.simpleName.run {
            Log.d(this, "$this onAttach")
        }
    }
}