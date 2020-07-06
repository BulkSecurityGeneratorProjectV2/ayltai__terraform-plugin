package com.github.ayltai.gradle.plugin;

import javax.annotation.Nonnull;

public abstract class Options {
    protected final String name;

    protected boolean noColor;

    protected Options(@Nonnull final String name) {
        this.name = name;
    }

    /**
     * Disables color codes in the command output if {@code true} is specified.
     * <p>Default is {@code false}</p>
     * @param noColor {@code true} to disable color codes in the command output.
     */
    public void noColor(final boolean noColor) {
        this.noColor = noColor;
    }
}
