package com.example.booktickethotel.Fragment;


import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.booktickethotel.R;
import com.example.booktickethotel.model.user;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {
    private OnFragmentInteractionListener mListener;


    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login, container,false);
        final EditText username = view.findViewById(R.id.enter_username);
        final EditText password = view.findViewById(R.id.enter_password);
        final ArrayList<user> listUser = new ArrayList<user>();
        listUser.add(new user("victor","victor"));
        listUser.add(new user("Victor","Victor"));
        Button buttonlogin = view.findViewById(R.id.button_login);
        buttonlogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(mListener != null){
                    String userr = username.getText().toString();
                    String pass = password.getText().toString();
                    if(!TextUtils.isEmpty(userr) && !TextUtils.isEmpty(pass)){
                        boolean cek =false;
                        for(int i=0; i<listUser.size(); i++){
                            if(listUser.get(i).getUsername().equals(userr) && listUser.get(i).getPassword().equals(pass)){
                                Toast.makeText(getActivity(),"Welcome " + listUser.get(i).getUsername(), Toast.LENGTH_SHORT).show();
                                cek = false;
                            }else{
                                cek = true;
                            }
                        }
                        if (cek){
                            Toast.makeText(getActivity(),"Check your account !!",Toast.LENGTH_SHORT).show();
                        }
                    }else{
                        Toast.makeText(getActivity(),"Check your password !!",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener){
            mListener = (OnFragmentInteractionListener) context;
        }
        else{
            throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }
}
