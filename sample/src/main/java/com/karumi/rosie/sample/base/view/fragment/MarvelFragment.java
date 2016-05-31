/*
 *  Copyright (C) 2015 Karumi.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.karumi.rosie.sample.base.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.karumi.rosie.sample.R;
import com.karumi.rosie.view.RosieFragment;

import butterknife.ButterKnife;

public abstract class MarvelFragment extends RosieFragment {

  @Nullable
  @Override public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                     Bundle savedInstanceState) {
    View view = super.onCreateView(inflater, container, savedInstanceState);
    ButterKnife.bind(this, view);
    return view;
  }

  public void showGenericError() {
    Snackbar.make(getView(), getString(R.string.generic_error), Snackbar.LENGTH_SHORT).show();
  }

  public void showConnectionError() {
    Snackbar.make(getView(), getString(R.string.connection_error), Snackbar.LENGTH_SHORT).show();
  }
}
