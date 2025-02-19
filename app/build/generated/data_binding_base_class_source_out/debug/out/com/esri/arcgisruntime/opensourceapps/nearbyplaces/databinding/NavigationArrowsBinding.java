// Generated by view binder compiler. Do not edit!
package com.esri.arcgisruntime.opensourceapps.nearbyplaces.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.esri.arcgisruntime.opensourceapps.nearbyplaces.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class NavigationArrowsBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnBack;

  @NonNull
  public final Button btnNext;

  @NonNull
  public final LinearLayout imageContainer;

  private NavigationArrowsBinding(@NonNull LinearLayout rootView, @NonNull Button btnBack,
      @NonNull Button btnNext, @NonNull LinearLayout imageContainer) {
    this.rootView = rootView;
    this.btnBack = btnBack;
    this.btnNext = btnNext;
    this.imageContainer = imageContainer;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static NavigationArrowsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static NavigationArrowsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.navigation_arrows, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static NavigationArrowsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnBack;
      Button btnBack = rootView.findViewById(id);
      if (btnBack == null) {
        break missingId;
      }

      id = R.id.btnNext;
      Button btnNext = rootView.findViewById(id);
      if (btnNext == null) {
        break missingId;
      }

      LinearLayout imageContainer = (LinearLayout) rootView;

      return new NavigationArrowsBinding((LinearLayout) rootView, btnBack, btnNext, imageContainer);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
