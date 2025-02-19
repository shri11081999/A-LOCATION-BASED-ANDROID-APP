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

public final class RouteDetailHeaderBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView btnDetailHeaderClose;

  @NonNull
  public final LinearLayout routeDetailheaderLinearLayout;

  @NonNull
  public final TextView routeTxtDetail;

  private RouteDetailHeaderBinding(@NonNull LinearLayout rootView,
      @NonNull ImageView btnDetailHeaderClose, @NonNull LinearLayout routeDetailheaderLinearLayout,
      @NonNull TextView routeTxtDetail) {
    this.rootView = rootView;
    this.btnDetailHeaderClose = btnDetailHeaderClose;
    this.routeDetailheaderLinearLayout = routeDetailheaderLinearLayout;
    this.routeTxtDetail = routeTxtDetail;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RouteDetailHeaderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RouteDetailHeaderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.route_detail_header, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RouteDetailHeaderBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnDetailHeaderClose;
      ImageView btnDetailHeaderClose = rootView.findViewById(id);
      if (btnDetailHeaderClose == null) {
        break missingId;
      }

      id = R.id.route_detailheader_linear_layout;
      LinearLayout routeDetailheaderLinearLayout = rootView.findViewById(id);
      if (routeDetailheaderLinearLayout == null) {
        break missingId;
      }

      id = R.id.route_txt_detail;
      TextView routeTxtDetail = rootView.findViewById(id);
      if (routeTxtDetail == null) {
        break missingId;
      }

      return new RouteDetailHeaderBinding((LinearLayout) rootView, btnDetailHeaderClose,
          routeDetailheaderLinearLayout, routeTxtDetail);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
