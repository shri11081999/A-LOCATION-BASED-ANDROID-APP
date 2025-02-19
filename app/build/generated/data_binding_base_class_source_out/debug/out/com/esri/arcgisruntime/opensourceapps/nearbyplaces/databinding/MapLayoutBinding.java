// Generated by view binder compiler. Do not edit!
package com.esri.arcgisruntime.opensourceapps.nearbyplaces.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import com.esri.arcgisruntime.opensourceapps.nearbyplaces.R;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class MapLayoutBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final ImageView btnCloseDirections;

  @NonNull
  public final AppBarLayout mapAppbar;

  @NonNull
  public final CoordinatorLayout mapCoordinatorLayout;

  @NonNull
  public final FrameLayout mapFragmentContainer;

  @NonNull
  public final Toolbar mapToolbar;

  @NonNull
  public final LinearLayout routeDirectionsContainer;

  @NonNull
  public final LinearLayout routeDirectionsLinearLayout;

  @NonNull
  public final TextView routeTxtDirections;

  private MapLayoutBinding(@NonNull CoordinatorLayout rootView,
      @NonNull ImageView btnCloseDirections, @NonNull AppBarLayout mapAppbar,
      @NonNull CoordinatorLayout mapCoordinatorLayout, @NonNull FrameLayout mapFragmentContainer,
      @NonNull Toolbar mapToolbar, @NonNull LinearLayout routeDirectionsContainer,
      @NonNull LinearLayout routeDirectionsLinearLayout, @NonNull TextView routeTxtDirections) {
    this.rootView = rootView;
    this.btnCloseDirections = btnCloseDirections;
    this.mapAppbar = mapAppbar;
    this.mapCoordinatorLayout = mapCoordinatorLayout;
    this.mapFragmentContainer = mapFragmentContainer;
    this.mapToolbar = mapToolbar;
    this.routeDirectionsContainer = routeDirectionsContainer;
    this.routeDirectionsLinearLayout = routeDirectionsLinearLayout;
    this.routeTxtDirections = routeTxtDirections;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static MapLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MapLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.map_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MapLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnCloseDirections;
      ImageView btnCloseDirections = rootView.findViewById(id);
      if (btnCloseDirections == null) {
        break missingId;
      }

      id = R.id.map_appbar;
      AppBarLayout mapAppbar = rootView.findViewById(id);
      if (mapAppbar == null) {
        break missingId;
      }

      CoordinatorLayout mapCoordinatorLayout = (CoordinatorLayout) rootView;

      id = R.id.map_fragment_container;
      FrameLayout mapFragmentContainer = rootView.findViewById(id);
      if (mapFragmentContainer == null) {
        break missingId;
      }

      id = R.id.map_toolbar;
      Toolbar mapToolbar = rootView.findViewById(id);
      if (mapToolbar == null) {
        break missingId;
      }

      id = R.id.route_directions_container;
      LinearLayout routeDirectionsContainer = rootView.findViewById(id);
      if (routeDirectionsContainer == null) {
        break missingId;
      }

      id = R.id.route_directions_linear_layout;
      LinearLayout routeDirectionsLinearLayout = rootView.findViewById(id);
      if (routeDirectionsLinearLayout == null) {
        break missingId;
      }

      id = R.id.route_txt_directions;
      TextView routeTxtDirections = rootView.findViewById(id);
      if (routeTxtDirections == null) {
        break missingId;
      }

      return new MapLayoutBinding((CoordinatorLayout) rootView, btnCloseDirections, mapAppbar,
          mapCoordinatorLayout, mapFragmentContainer, mapToolbar, routeDirectionsContainer,
          routeDirectionsLinearLayout, routeTxtDirections);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
