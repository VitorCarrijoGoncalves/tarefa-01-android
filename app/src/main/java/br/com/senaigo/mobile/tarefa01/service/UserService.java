package br.com.senaigo.mobile.tarefa01.service;

import retrofit2.http.GET;

public interface UserService {

    @GET("")
    listUsers();

}
