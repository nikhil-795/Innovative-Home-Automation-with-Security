// Generated by view binder compiler. Do not edit!
package com.example.ihaws.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewbinding.ViewBinding;
import com.example.ihaws.R;
import com.google.android.material.navigation.NavigationView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityNavigationBinding implements ViewBinding {
  @NonNull
  private final DrawerLayout rootView;

  @NonNull
  public final DrawerLayout drawerLayout;

  @NonNull
  public final FrameLayout fragmentContainer;

  @NonNull
  public final NavigationView navView;

  @NonNull
  public final Toolbar toolbar;

  private ActivityNavigationBinding(@NonNull DrawerLayout rootView,
      @NonNull DrawerLayout drawerLayout, @NonNull FrameLayout fragmentContainer,
      @NonNull NavigationView navView, @NonNull Toolbar toolbar) {
    this.rootView = rootView;
    this.drawerLayout = drawerLayout;
    this.fragmentContainer = fragmentContainer;
    this.navView = navView;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public DrawerLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityNavigationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityNavigationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_navigation, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityNavigationBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      DrawerLayout drawerLayout = (DrawerLayout) rootView;

      id = R.id.fragment_container;
      FrameLayout fragmentContainer = rootView.findViewById(id);
      if (fragmentContainer == null) {
        break missingId;
      }

      id = R.id.nav_view;
      NavigationView navView = rootView.findViewById(id);
      if (navView == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = rootView.findViewById(id);
      if (toolbar == null) {
        break missingId;
      }

      return new ActivityNavigationBinding((DrawerLayout) rootView, drawerLayout, fragmentContainer,
          navView, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
