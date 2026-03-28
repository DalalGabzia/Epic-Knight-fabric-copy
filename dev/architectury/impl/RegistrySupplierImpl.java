/*
 * This file is part of architectury.
 * Copyright (C) 2020, 2021, 2022 architectury
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

package dev.architectury.impl;

import com.mojang.datafixers.util.Either;
import dev.architectury.registry.registries.RegistrySupplier;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;
import net.minecraft.class_2960;
import net.minecraft.class_5321;
import net.minecraft.class_6862;
import net.minecraft.class_6880;
import net.minecraft.class_7876;

@ApiStatus.Internal
public interface RegistrySupplierImpl<T> extends RegistrySupplier<T> {
    @Nullable
    class_6880<T> getHolder();
    
    @Override
    default T comp_349() {
        return get();
    }
    
    @Override
    default boolean method_40227() {
        return isPresent();
    }
    
    @Override
    default boolean method_40226(class_2960 resourceLocation) {
        return getId().equals(resourceLocation);
    }
    
    @Override
    default boolean method_40225(class_5321<T> resourceKey) {
        return getKey().equals(resourceKey);
    }
    
    @Override
    default boolean method_40224(Predicate<class_5321<T>> predicate) {
        return predicate.test(getKey());
    }
    
    @Override
    default boolean method_40220(class_6862<T> tagKey) {
        class_6880<T> holder = getHolder();
        return holder != null && holder.method_40220(tagKey);
    }
    
    @Override
    default boolean method_55838(class_6880<T> holder) {
        return holder.method_40225(getKey());
    }
    
    @Override
    default Stream<class_6862<T>> method_40228() {
        class_6880<T> holder = getHolder();
        return holder != null ? holder.method_40228() : Stream.empty();
    }
    
    @Override
    default Either<class_5321<T>, T> method_40229() {
        return Either.left(getKey());
    }
    
    @Override
    default Optional<class_5321<T>> method_40230() {
        return Optional.of(getKey());
    }
    
    @Override
    default class_6882 method_40231() {
        return class_6882.field_36446;
    }
    
    @Override
    default boolean method_46745(class_7876<T> holderOwner) {
        class_6880<T> holder = getHolder();
        return holder != null && holder.method_46745(holderOwner);
    }
}
