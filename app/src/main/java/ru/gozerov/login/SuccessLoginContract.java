package ru.gozerov.login;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class SuccessLoginContract extends ActivityResultContract<Person, Object> {

    @NonNull
    @Override
    public Intent createIntent(@NonNull Context context, Person p) {
        Intent intent = new Intent(context, SuccessLoginActivity.class);
        intent.putExtra(MainActivity.KEY, p);
        return intent;
    }

    @Override
    public String parseResult(int resultCode, @Nullable Intent intent) {
        if (resultCode == Activity.RESULT_OK && intent != null)
            return intent.getStringExtra(MainActivity.KEY);
        else
            return null;
    }

}
