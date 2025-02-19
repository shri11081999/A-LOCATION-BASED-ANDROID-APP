// Generated by view binder compiler. Do not edit!
package com.esri.arcgisruntime.opensourceapps.nearbyplaces.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.esri.arcgisruntime.opensourceapps.nearbyplaces.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class RouteHeaderBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout appBarLinearLayout;

  @NonNull
  public final ImageView btnClose;

  @NonNull
  public final ImageView btnDirections;

  @NonNull
  public final TextView routeBarTitle;

  @NonNull
  public final TextView routeTime;

  private RouteHeaderBinding(@NonNull LinearLayout rootView,
      @NonNull LinearLayout appBarLinearLayout, @NonNull ImageView btnClose,
      @NonNull ImageView btnDirections, @NonNull TextView routeBarTitle,
      @NonNull TextView routeTime) {
    this.rootView = rootView;
    this.appBarLinearLayout = appBarLinearLayout;
    this.btnClose = btnClose;
    this.btnDirections = btnDirections;
    this.routeBarTitle = routeBarTitle;
    this.routeTime = routeTime;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RouteHeaderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RouteHeaderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.route_header, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RouteHeaderBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      LinearLayout appBarLinearLayout = (LinearLayout) rootView;

      id = R.id.btnClose;
      ImageView btnClose = rootView.findViewById(id);
      if (btnClose == null) {
        break missingId;
      }

      id = R.id.btnDirections;
      ImageView btnDirections = rootView.findViewById(id);
      if (btnDirections == null) {
        break missingId;
      }

      id = R.id.route_bar_title;
      TextView routeBarTitle = rootView.findViewById(id);
      if (routeBarTitle == null) {
        break missingId;
      }

      id = R.id.routeTime;
      TextView routeTime = rootView.findViewById(id);
      if (routeTime == null) {
        break missingId;
      }

      return new RouteHeaderBinding((LinearLayout) rootView, appBarLinearLayout, btnClose,
          btnDirections, routeBarTitle, routeTime);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
