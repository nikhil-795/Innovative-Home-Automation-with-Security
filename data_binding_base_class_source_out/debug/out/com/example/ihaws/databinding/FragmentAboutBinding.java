// Generated by view binder compiler. Do not edit!
package com.example.ihaws.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.example.ihaws.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentAboutBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView textAbout;

  @NonNull
  public final TextView textAcronym;

  @NonNull
  public final TextView textAppIntent;

  @NonNull
  public final TextView textBrief;

  @NonNull
  public final TextView textCopyrightInfo;

  @NonNull
  public final TextView textDesignerAndDeveloperInfo;

  private FragmentAboutBinding(@NonNull RelativeLayout rootView, @NonNull TextView textAbout,
      @NonNull TextView textAcronym, @NonNull TextView textAppIntent, @NonNull TextView textBrief,
      @NonNull TextView textCopyrightInfo, @NonNull TextView textDesignerAndDeveloperInfo) {
    this.rootView = rootView;
    this.textAbout = textAbout;
    this.textAcronym = textAcronym;
    this.textAppIntent = textAppIntent;
    this.textBrief = textBrief;
    this.textCopyrightInfo = textCopyrightInfo;
    this.textDesignerAndDeveloperInfo = textDesignerAndDeveloperInfo;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAboutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAboutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_about, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAboutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.text_about;
      TextView textAbout = rootView.findViewById(id);
      if (textAbout == null) {
        break missingId;
      }

      id = R.id.text_acronym;
      TextView textAcronym = rootView.findViewById(id);
      if (textAcronym == null) {
        break missingId;
      }

      id = R.id.text_app_intent;
      TextView textAppIntent = rootView.findViewById(id);
      if (textAppIntent == null) {
        break missingId;
      }

      id = R.id.text_brief;
      TextView textBrief = rootView.findViewById(id);
      if (textBrief == null) {
        break missingId;
      }

      id = R.id.text_copyright_info;
      TextView textCopyrightInfo = rootView.findViewById(id);
      if (textCopyrightInfo == null) {
        break missingId;
      }

      id = R.id.text_designer_and_developer_info;
      TextView textDesignerAndDeveloperInfo = rootView.findViewById(id);
      if (textDesignerAndDeveloperInfo == null) {
        break missingId;
      }

      return new FragmentAboutBinding((RelativeLayout) rootView, textAbout, textAcronym,
          textAppIntent, textBrief, textCopyrightInfo, textDesignerAndDeveloperInfo);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
