package pl.awkwiecin.adapter.adapterHomeTask.api.api;

import co.devfoundry.adapter.adapterHomeTask.api.User;

import java.time.LocalDate;

public class APIAdapter implements LibraryAPI{

    private LibraryAPIv2 libraryAPIv2;
    private User user;

    public APIAdapter(LibraryAPIv2 libraryAPIv2, User user) {
        this.libraryAPIv2 = libraryAPIv2;
        this.user = user;
    }

    @Override
    public boolean isAviable(String bookTitle) {

       if(libraryAPIv2.numberOfAviableCopies(bookTitle)!=0)
           return true;
       else
           return false;
    }

    @Override
    public LocalDate dueDate(String bookTitle, String pesel) {
        return libraryAPIv2.dueDate(bookTitle, user.getFirstName(), user.getLastName(), user.getDateOfBirth());
    }

    @Override
    public boolean reserve(String bookTitle, String pesel) {
        return libraryAPIv2.reserve(bookTitle, user.getFirstName(), user.getLastName(), user.getDateOfBirth());
    }
}
