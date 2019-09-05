package com.example.provadm1.services;

import com.example.provadm1.entities.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiEndPoint {
    @GET("notas")
    Call<List<User>> obterUsuarios();
}
