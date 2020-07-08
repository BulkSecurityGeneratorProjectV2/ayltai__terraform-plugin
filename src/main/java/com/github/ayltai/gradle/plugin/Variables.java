package com.github.ayltai.gradle.plugin;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class Variables extends Options {
    private static final long serialVersionUID = 1L;

    protected final List<Variable<?>> vars  = new ArrayList<>();
    protected final List<File>        files = new ArrayList<>();

    public Variables(@Nonnull final String name) {
        super(name);
    }

    public <T> void var(@Nonnull final String name, @Nullable final T value) {
        this.vars.add(Variable.create(name, value));
    }

    public void file(@Nonnull final File file) {
        this.files.add(file);
    }

    private static void writeObject(@Nonnull final ObjectOutputStream outputStream) throws IOException {
        outputStream.defaultWriteObject();
    }

    private static void readObject(@Nonnull final ObjectInputStream inputStream) throws IOException, ClassNotFoundException {
        inputStream.defaultReadObject();
    }
}
