package com.springapp.model;

import javax.persistence.*;

/**
 * Created by Alicja on 2015-01-05.
 */
@Entity
@Table(name = "typparametru", schema = "", catalog = "esothebys_db")
public class TypparametruEntity {
    private int id;
    private Integer textBox;
    private Integer comboBox;
    private Integer checkBozList;
    private Integer zakres;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "TextBox")
    public Integer getTextBox() {
        return textBox;
    }

    public void setTextBox(Integer textBox) {
        this.textBox = textBox;
    }

    @Basic
    @Column(name = "ComboBox")
    public Integer getComboBox() {
        return comboBox;
    }

    public void setComboBox(Integer comboBox) {
        this.comboBox = comboBox;
    }

    @Basic
    @Column(name = "CheckBozList")
    public Integer getCheckBozList() {
        return checkBozList;
    }

    public void setCheckBozList(Integer checkBozList) {
        this.checkBozList = checkBozList;
    }

    @Basic
    @Column(name = "Zakres")
    public Integer getZakres() {
        return zakres;
    }

    public void setZakres(Integer zakres) {
        this.zakres = zakres;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TypparametruEntity that = (TypparametruEntity) o;

        if (id != that.id) return false;
        if (checkBozList != null ? !checkBozList.equals(that.checkBozList) : that.checkBozList != null) return false;
        if (comboBox != null ? !comboBox.equals(that.comboBox) : that.comboBox != null) return false;
        if (textBox != null ? !textBox.equals(that.textBox) : that.textBox != null) return false;
        if (zakres != null ? !zakres.equals(that.zakres) : that.zakres != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (textBox != null ? textBox.hashCode() : 0);
        result = 31 * result + (comboBox != null ? comboBox.hashCode() : 0);
        result = 31 * result + (checkBozList != null ? checkBozList.hashCode() : 0);
        result = 31 * result + (zakres != null ? zakres.hashCode() : 0);
        return result;
    }
}
