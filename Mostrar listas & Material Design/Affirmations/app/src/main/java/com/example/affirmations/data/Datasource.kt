/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation


class Datasource() {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, R.drawable.day1, R.string.description1),
            Affirmation(R.string.affirmation2, R.drawable.day2, R.string.description2),
            Affirmation(R.string.affirmation3, R.drawable.day3, R.string.description3),
            Affirmation(R.string.affirmation4, R.drawable.day4, R.string.description4),
            Affirmation(R.string.affirmation5, R.drawable.day5, R.string.description5),
            Affirmation(R.string.affirmation6, R.drawable.day6, R.string.description6),
            Affirmation(R.string.affirmation7, R.drawable.day7, R.string.description7),
            Affirmation(R.string.affirmation8, R.drawable.day8, R.string.description8),
            Affirmation(R.string.affirmation9, R.drawable.day9, R.string.description9),
            Affirmation(R.string.affirmation10, R.drawable.day10, R.string.description10),
            Affirmation(R.string.affirmation11, R.drawable.day11, R.string.description11),
            Affirmation(R.string.affirmation12, R.drawable.day12, R.string.description12),
            Affirmation(R.string.affirmation13, R.drawable.day13, R.string.description13),
            Affirmation(R.string.affirmation14, R.drawable.day14, R.string.description14),
            Affirmation(R.string.affirmation15, R.drawable.day15, R.string.description15),
            Affirmation(R.string.affirmation16, R.drawable.day16, R.string.description16),
            Affirmation(R.string.affirmation17, R.drawable.day17, R.string.description17),
            Affirmation(R.string.affirmation18, R.drawable.day18, R.string.description18),
            Affirmation(R.string.affirmation19, R.drawable.day19, R.string.description19),
            Affirmation(R.string.affirmation20, R.drawable.day20, R.string.description20),
            Affirmation(R.string.affirmation21, R.drawable.day21, R.string.description21),
            Affirmation(R.string.affirmation22, R.drawable.day22, R.string.description22),
            Affirmation(R.string.affirmation23, R.drawable.day23, R.string.description23),
            Affirmation(R.string.affirmation24, R.drawable.day24, R.string.description24),
            Affirmation(R.string.affirmation25, R.drawable.day25, R.string.description25),
            Affirmation(R.string.affirmation26, R.drawable.day26, R.string.description26),
            Affirmation(R.string.affirmation27, R.drawable.day27, R.string.description27),
            Affirmation(R.string.affirmation28, R.drawable.day28, R.string.description28),
            Affirmation(R.string.affirmation29, R.drawable.day29, R.string.description29),
            Affirmation(R.string.affirmation30, R.drawable.day30, R.string.description30)
        )
    }
}
