package com.galt.library.core.model.fx;

import com.galt.library.core.model.Author;
import com.galt.library.core.model.Book;
import com.j256.ormlite.field.DatabaseField;
import javafx.beans.property.*;

import java.util.Date;

/**
 * Created by Grishechko on 26.11.2015.
 */
public class FxBook extends FxBase<Book> {

    private Book book;
    private IntegerProperty id;
    private StringProperty name;
    private ObjectProperty<FxGenre> genre;
    private ObjectProperty<Date> date;
    private IntegerProperty pageNumbers;
    private StringProperty state;
    private StringProperty size;
    private StringProperty weight;
    private StringProperty cost;
    private ObjectProperty<FxAuthor> author;
    private ObjectProperty<FxPublisher> publisher;

    public FxBook(Book object) {
        super(object);
    }

    @Override
    void update(Book object) {
        book = object;
        id = new SimpleIntegerProperty(object.getId());
        name = new SimpleStringProperty(object.getName());
        date = new SimpleObjectProperty<>(object.getDate());
        pageNumbers = new SimpleIntegerProperty(object.getPageNumbers());
        state = new SimpleStringProperty(object.getState());
        size = new SimpleStringProperty(object.getSize());
        weight = new SimpleStringProperty(object.getWeight());
        cost = new SimpleStringProperty(object.getCost());
        author = new SimpleObjectProperty<>(new FxAuthor(object.getAuthor()));
        genre = new SimpleObjectProperty<>(new FxGenre(object.getGenre()));
        publisher = new SimpleObjectProperty<>(new FxPublisher(object.getPublisher()));
    }

    public int getId() {
        return id.get();
    }

    public IntegerProperty idProperty() {
        return id;
    }

    public void setId(int id) {
        this.id.set(id);
    }

    public String getName() {
        return name.get();
    }

    public StringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public Date getDate() {
        return date.get();
    }

    public ObjectProperty<Date> dateProperty() {
        return date;
    }

    public void setDate(Date date) {
        this.date.set(date);
    }

    public int getPageNumbers() {
        return pageNumbers.get();
    }

    public IntegerProperty pageNumbersProperty() {
        return pageNumbers;
    }

    public void setPageNumbers(int pageNumbers) {
        this.pageNumbers.set(pageNumbers);
    }

    public String getState() {
        return state.get();
    }

    public StringProperty stateProperty() {
        return state;
    }

    public void setState(String state) {
        this.state.set(state);
    }

    public String getSize() {
        return size.get();
    }

    public StringProperty sizeProperty() {
        return size;
    }

    public void setSize(String size) {
        this.size.set(size);
    }

    public String getWeight() {
        return weight.get();
    }

    public StringProperty weightProperty() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight.set(weight);
    }

    public String getCost() {
        return cost.get();
    }

    public StringProperty costProperty() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost.set(cost);
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public FxGenre getGenre() {
        return genre.get();
    }

    public ObjectProperty<FxGenre> genreProperty() {
        return genre;
    }

    public void setGenre(FxGenre genre) {
        this.genre.set(genre);
    }

    public FxAuthor getAuthor() {
        return author.get();
    }

    public ObjectProperty<FxAuthor> authorProperty() {
        return author;
    }

    public void setAuthor(FxAuthor author) {
        this.author.set(author);
    }

    public FxPublisher getPublisher() {
        return publisher.get();
    }

    public ObjectProperty<FxPublisher> publisherProperty() {
        return publisher;
    }

    public void setPublisher(FxPublisher publisher) {
        this.publisher.set(publisher);
    }
}
