// Generated by view binder compiler. Do not edit!
package com.esri.arcgisruntime.opensourceapps.nearbyplaces.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.esri.arcgisruntime.opensourceapps.nearbyplaces.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class RouteDirectionListBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ListView directionsList;

  private RouteDirectionListBinding(@NonNull LinearLayout rootView,
      @NonNull ListView directionsList) {
    this.rootView = rootView;
    this.directionsList = directionsList;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RouteDirectionListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RouteDirectionListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.route_direction_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RouteDirectionListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.directions_list;
      ListView directionsList = rootView.findViewById(id);
      if (directionsList == null) {
        break missingId;
      }

      return new RouteDirectionListBinding((LinearLayout) rootView, directionsList);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
