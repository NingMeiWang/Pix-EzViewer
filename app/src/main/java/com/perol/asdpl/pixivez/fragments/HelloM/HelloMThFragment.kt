package com.perol.asdpl.pixivez.fragments.HelloM


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.perol.asdpl.pixivez.R
import com.perol.asdpl.pixivez.adapters.viewpager.HelloMThViewPager
import com.perol.asdpl.pixivez.networks.SharedPreferencesServices
import com.perol.asdpl.pixivez.objects.LazyV4Fragment
import kotlinx.android.synthetic.main.fragment_hello_mth.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HelloMThFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class HelloMThFragment : LazyV4Fragment() {
    override fun lazyLoad() {
        viewpager_hellomth.adapter = HelloMThViewPager(context!!,childFragmentManager, SharedPreferencesServices.getInstance().getString("userid").toLong())
        tablayout_hellomth.setupWithViewPager(viewpager_hellomth)
        viewpager_hellomth.offscreenPageLimit=3
    }

    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun setUserVisibleHint(isVisibleToUser: Boolean) {
        super.setUserVisibleHint(isVisibleToUser)
    }



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        isViewCreated=true
        return inflater.inflate(R.layout.fragment_hello_mth, container, false)
    }


    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HelloMThFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
                HelloMThFragment().apply {
                    arguments = Bundle().apply {
                        putString(ARG_PARAM1, param1)
                        putString(ARG_PARAM2, param2)
                    }
                }
    }
}
