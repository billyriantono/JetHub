package com.takusemba.jethub.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.takusemba.jethub.R
import com.takusemba.jethub.databinding.FragmentFeedBinding
import dagger.android.support.DaggerFragment

class FeedFragment : DaggerFragment() {

  companion object {

    fun newInstance() = FeedFragment()
  }

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    return inflater.inflate(R.layout.fragment_feed, container, false)
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    val binding = DataBindingUtil.bind<FragmentFeedBinding>(view)!!
  }
}