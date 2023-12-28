package com.questions.answers.fast.thefirstqa

import com.google.gson.Gson
import com.questions.answers.fast.thefirstqa.data.QaDetail
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        val inputString = """

1. "How many hours are there in a day?"
Answers: a) 12 b) 18 c) 24 d) 30 (Correct Answer: c)

2. "What is the opposite of 'day'?"
   Answers: a) Night b) Morning c) Afternoon d) Evening (Correct Answer: a)

3. "What do plants need to undergo photosynthesis?"
   Answers: a) Water b) Soil c) Sunlight d) Wind (Correct Answer: c)

4. "Which season comes after winter?"
   Answers: a) Spring b) Summer c) Autumn d) Monsoon (Correct Answer: a)

5. "How many fingers does a person have on one hand?"
   Answers: a) 3 b) 5 c) 7 d) 10 (Correct Answer: b)

6. "What is the color of the sun?"
   Answers: a) Yellow b) Red c) Orange d) White (Correct Answer: a)

7. "What is the primary gas that humans breathe in?"
   Answers: a) Carbon Dioxide b) Nitrogen c) Oxygen d) Hydrogen (Correct Answer: c)

8. "Which planet is known as the 'Blue Planet'?"
   Answers: a) Mars b) Earth c) Neptune d) Uranus (Correct Answer: b)

9. "What is the main ingredient in guacamole?"
   Answers: a) Tomato b) Avocado c) Onion d) Cilantro (Correct Answer: b)

10. "Which day of the week comes after Thursday?"
    Answers: a) Saturday b) Sunday c) Monday d) Wednesday (Correct Answer: a)

11. "What is the process of water turning into vapor called?"
    Answers: a) Condensation b) Evaporation c) Precipitation d) Filtration (Correct Answer: b)

12. "What is the largest organ in the human body?"
    Answers: a) Heart b) Liver c) Skin d) Lungs (Correct Answer: c)

13. "Which natural disaster is characterized by shaking of the ground?"
    Answers: a) Tornado b) Earthquake c) Hurricane d) Flood (Correct Answer: b)

14. "What is the capital city of the United States?"
    Answers: a) Washington, D.C. b) New York City c) Los Angeles d) Chicago (Correct Answer: a)

15. "How many weeks are there in a year?"
    Answers: a) 48 b) 52 c) 56 d) 60 (Correct Answer: b)

16. "Which fruit is known as the 'king of fruits' and has a strong smell?"
    Answers: a) Banana b) Mango c) Apple d) Orange (Correct Answer: b)

17. "What is the process of plants making their own food through sunlight called?"
    Answers: a) Respiration b) Photosynthesis c) Digestion d) Transpiration (Correct Answer: b)

18. "Which gas is responsible for the feeling of freshness in the air after rain?"
    Answers: a) Oxygen b) Nitrogen c) Carbon Dioxide d) Ozone (Correct Answer: d)

19. "What is the largest mammal on land?"
    Answers: a) Elephant b) Giraffe c) Rhinoceros d) Hippopotamus (Correct Answer: a)

20. "What is the opposite of 'old'?"
    Answers: a) Young b) Ancient c) Senior d) Aged (Correct Answer: a)


1. "What is the capital city of Australia?"
Answers: a) Sydney b) Melbourne c) Canberra d) Brisbane (Correct Answer: c)

2. "Which planet is known as the 'Red Planet' in our solar system?"
   Answers: a) Venus b) Mars c) Jupiter d) Saturn (Correct Answer: b)

3. "What is the currency used in Japan?"
   Answers: a) Yen b) Won c) Ringgit d) Baht (Correct Answer: a)

4. "In which ocean is the Bermuda Triangle located?"
   Answers: a) Pacific Ocean b) Atlantic Ocean c) Indian Ocean d) Southern Ocean (Correct Answer: b)

5. "What is the tallest mountain in the world?"
   Answers: a) K2 b) Mount Everest c) Kanchenjunga d) Lhotse (Correct Answer: b)

6. "Which element has the chemical symbol 'O' on the periodic table?"
   Answers: a) Oxygen b) Gold c) Iron d) Uranium (Correct Answer: a)

7. "What is the capital city of Brazil?"
   Answers: a) Brasília b) Rio de Janeiro c) São Paulo d) Salvador (Correct Answer: a)

8. "How many continents are there on Earth?"
   Answers: a) 5 b) 6 c) 7 d) 8 (Correct Answer: c)

9. "Which country is known as the 'Land of the Rising Sun'?"
   Answers: a) China b) South Korea c) Japan d) Vietnam (Correct Answer: c)

10. "What is the largest mammal in the world?"
    Answers: a) Elephant b) Blue Whale c) Giraffe d) Gorilla (Correct Answer: b)

11. "Which natural disaster is measured on the Richter scale?"
    Answers: a) Hurricane b) Earthquake c) Tornado d) Tsunami (Correct Answer: b)

12. "What is the capital city of France?"
    Answers: a) Berlin b) Rome c) Paris d) Madrid (Correct Answer: c)

13. "Which planet is known as the 'Morning Star' or 'Evening Star'?"
    Answers: a) Mars b) Venus c) Mercury d) Jupiter (Correct Answer: b)

14. "In which year did the Titanic sink?"
    Answers: a) 1910 b) 1912 c) 1915 d) 1918 (Correct Answer: b)

15. "What is the currency used in the United Kingdom?"
    Answers: a) Euro b) Dollar c) Pound Sterling d) Yen (Correct Answer: c)

16. "Which ocean is the largest by surface area?"
    Answers: a) Indian Ocean b) Atlantic Ocean c) Southern Ocean d) Pacific Ocean (Correct Answer: d)

17. "What is the main component of Earth's atmosphere?"
    Answers: a) Nitrogen b) Oxygen c) Carbon Dioxide d) Hydrogen (Correct Answer: b)

18. "Which famous scientist developed the theory of general relativity?"
    Answers: a) Isaac Newton b) Albert Einstein c) Galileo Galilei d) Stephen Hawking (Correct Answer: b)

19. "In which country is the Great Barrier Reef located?"
    Answers: a) Mexico b) Australia c) Brazil d) Thailand (Correct Answer: b)

20. "What is the largest desert in the world by area?"
    Answers: a) Sahara Desert b) Gobi Desert c) Antarctic Desert d) Arabian Desert (Correct Answer: c)


1. "What is the capital city of France?"
Answers: a) Rome b) Berlin c) Paris d) Madrid (Correct Answer: c)

2. "Which planet is known as the 'Red Planet' in our solar system?"
   Answers: a) Venus b) Mars c) Jupiter d) Saturn (Correct Answer: b)

3. "What is the currency of Japan?"
   Answers: a) Won b) Yen c) Baht d) Rupee (Correct Answer: b)

4. "Who wrote 'Romeo and Juliet'?"
   Answers: a) Charles Dickens b) William Shakespeare c) Jane Austen d) Mark Twain (Correct Answer: b)

5. "Which ocean is the largest on Earth?"
   Answers: a) Atlantic Ocean b) Indian Ocean c) Southern Ocean d) Pacific Ocean (Correct Answer: d)

6. "In what year did Christopher Columbus first reach the Americas?"
   Answers: a) 1492 b) 1607 c) 1776 d) 1812 (Correct Answer: a)

7. "What is the main ingredient in guacamole?"
   Answers: a) Tomato b) Avocado c) Onion d) Cilantro (Correct Answer: b)

8. "Which gas do plants absorb during photosynthesis?"
   Answers: a) Oxygen b) Nitrogen c) Carbon Dioxide d) Hydrogen (Correct Answer: c)

9. "What is the smallest prime number?"
   Answers: a) 0 b) 1 c) 2 d) 3 (Correct Answer: c)

10. "Who painted the 'Mona Lisa'?"
    Answers: a) Vincent van Gogh b) Leonardo da Vinci c) Pablo Picasso d) Michelangelo (Correct Answer: b)

11. "What is the largest organ in the human body?"
    Answers: a) Heart b) Liver c) Skin d) Lungs (Correct Answer: c)

12. "What is the process of water turning into vapor called?"
    Answers: a) Condensation b) Evaporation c) Precipitation d) Filtration (Correct Answer: b)

13. "What is the chemical symbol for gold?"
    Answers: a) Gd b) Au c) Ag d) Fe (Correct Answer: b)

14. "Which planet is known as the 'Blue Planet'?"
    Answers: a) Mars b) Earth c) Neptune d) Uranus (Correct Answer: b)

15. "In what year did the Titanic sink?"
    Answers: a) 1905 b) 1912 c) 1923 d) 1930 (Correct Answer: b)

16. "Who is the author of the Harry Potter book series?"
    Answers: a) J.R.R. Tolkien b) J.K. Rowling c) George R.R. Martin d) Suzanne Collins (Correct Answer: b)

17. "What is the main ingredient in traditional Japanese miso soup?"
    Answers: a) Tofu b) Seaweed c) Miso paste d) Rice (Correct Answer: c)

18. "What is the speed of light in a vacuum?"
    Answers: a) 300,000 km/s b) 500,000 km/s c) 700,000 km/s d) 900,000 km/s (Correct Answer: a)

19. "Which famous scientist developed the theory of general relativity?"
    Answers: a) Isaac Newton b) Albert Einstein c) Galileo Galilei d) Stephen Hawking (Correct Answer: b)

20. "What is the capital city of Australia?"
    Answers: a) Sydney b) Melbourne c) Canberra d) Brisbane (Correct Answer: c)

1. "Which natural disaster is measured on the Richter scale?"
Answers: a) Hurricane b) Tornado c) Earthquake d) Flood (Correct Answer: c)

2. "What is the largest mammal in the world?"
   Answers: a) Elephant b) Blue whale c) Giraffe d) Polar bear (Correct Answer: b)

3. "Which planet is known as the 'Morning Star' or 'Evening Star'?"
   Answers: a) Mars b) Venus c) Mercury d) Jupiter (Correct Answer: b)

4. "What is the chemical symbol for water?"
   Answers: a) O2 b) CO2 c) H2O d) N2 (Correct Answer: c)

5. "Which gas do plants release during photosynthesis?"
   Answers: a) Oxygen b) Nitrogen c) Carbon Dioxide d) Hydrogen (Correct Answer: a)

6. "In what year did the United States declare its independence?"
   Answers: a) 1676 b) 1756 c) 1776 d) 1865 (Correct Answer: c)

7. "What is the process of a liquid turning into a gas called?"
   Answers: a) Freezing b) Melting c) Condensation d) Boiling (Correct Answer: d)

8. "Which organ is responsible for filtering blood in the human body?"
   Answers: a) Liver b) Kidneys c) Heart d) Lungs (Correct Answer: b)

9. "What is the currency of China?"
   Answers: a) Yen b) Won c) Yuan d) Ringgit (Correct Answer: c)

10. "Who wrote 'To Kill a Mockingbird'?"
    Answers: a) F. Scott Fitzgerald b) J.D. Salinger c) Harper Lee d) Ernest Hemingway (Correct Answer: c)

11. "What is the main ingredient in the dish sushi?"
    Answers: a) Rice b) Seaweed c) Tofu d) Noodles (Correct Answer: a)

12. "In what year did the Berlin Wall fall, leading to the reunification of Germany?"
    Answers: a) 1985 b) 1991 c) 2000 d) 2005 (Correct Answer: b)

13. "What is the world's largest ocean?"
    Answers: a) Atlantic Ocean b) Indian Ocean c) Southern Ocean d) Pacific Ocean (Correct Answer: d)

14. "Which gas makes up the majority of Earth's atmosphere?"
    Answers: a) Oxygen b) Nitrogen c) Carbon Dioxide d) Argon (Correct Answer: b)

15. "Who painted the famous artwork 'Starry Night'?"
    Answers: a) Claude Monet b) Vincent van Gogh c) Pablo Picasso d) Leonardo da Vinci (Correct Answer: b)

16. "What is the capital city of Brazil?"
    Answers: a) Buenos Aires b) Lima c) Rio de Janeiro d) Brasília (Correct Answer: d)

17. "What is the process of plants making food using sunlight called?"
    Answers: a) Respiration b) Transpiration c) Photosynthesis d) Digestion (Correct Answer: c)

18. "Which human organ can regenerate tissue to some extent?"
    Answers: a) Heart b) Liver c) Kidneys d) Lungs (Correct Answer: b)

19. "What is the chemical symbol for gold?"
    Answers: a) Gd b) Au c) Ag d) Fe (Correct Answer: b)

20. "Which natural satellite orbits the Earth?"
    Answers: a) Mars b) Moon c) Venus d) Jupiter (Correct Answer: b)

1. "What is the largest mammal on land?"
Answers: a) Elephant b) Giraffe c) Rhinoceros d) Lion (Correct Answer: a)

2. "Which planet is known as the 'Red Planet'?"
   Answers: a) Venus b) Mars c) Jupiter d) Saturn (Correct Answer: b)

3. "In what year did the Titanic sink?"
   Answers: a) 1905 b) 1912 c) 1920 d) 1931 (Correct Answer: b)

4. "What is the powerhouse of the cell?"
   Answers: a) Nucleus b) Ribosome c) Mitochondria d) Endoplasmic reticulum (Correct Answer: c)

5. "Which country is known as the 'Land of the Rising Sun'?"
   Answers: a) China b) Japan c) South Korea d) Vietnam (Correct Answer: b)

6. "What is the capital city of Australia?"
   Answers: a) Sydney b) Melbourne c) Canberra d) Brisbane (Correct Answer: c)

7. "Which famous scientist developed the theory of relativity?"
   Answers: a) Isaac Newton b) Albert Einstein c) Galileo Galilei d) Stephen Hawking (Correct Answer: b)

8. "What is the chemical symbol for the element oxygen?"
   Answers: a) O2 b) CO2 c) H2O d) O (Correct Answer: d)

9. "Which ocean is the largest on Earth?"
   Answers: a) Atlantic Ocean b) Indian Ocean c) Southern Ocean d) Pacific Ocean (Correct Answer: d)

10. "What is the primary function of the human heart?"
    Answers: a) Pumping blood b) Digesting food c) Filtering air d) Storing energy (Correct Answer: a)

11. "Which planet is known as the 'Evening Star'?"
    Answers: a) Mars b) Venus c) Mercury d) Jupiter (Correct Answer: b)

12. "In what year did the United States gain its independence from Britain?"
    Answers: a) 1676 b) 1756 c) 1776 d) 1865 (Correct Answer: c)

13. "What is the process of a liquid turning into a gas called?"
    Answers: a) Freezing b) Melting c) Condensation d) Boiling (Correct Answer: d)

14. "Which gas do plants absorb during photosynthesis?"
    Answers: a) Oxygen b) Nitrogen c) Carbon Dioxide d) Hydrogen (Correct Answer: c)

15. "What is the capital city of France?"
    Answers: a) Berlin b) Paris c) London d) Rome (Correct Answer: b)

16. "What is the currency of Japan?"
    Answers: a) Yen b) Won c) Yuan d) Ringgit (Correct Answer: a)

17. "Which famous playwright wrote 'Romeo and Juliet'?"
    Answers: a) William Shakespeare b) Charles Dickens c) Jane Austen d) Mark Twain (Correct Answer: a)

18. "What is the main ingredient in guacamole?"
    Answers: a) Tomato b) Avocado c) Onion d) Pepper (Correct Answer: b)

19. "Which gas is responsible for the Earth's greenhouse effect?"
    Answers: a) Oxygen b) Nitrogen c) Methane d) Hydrogen (Correct Answer: c)

20. "Who painted the Mona Lisa?"
    Answers: a) Pablo Picasso b) Vincent van Gogh c) Leonardo da Vinci d) Claude Monet (Correct Answer: c)
        
    """.trimIndent()

        val questions = parseQuestions(inputString)
        val data = Gson().toJson(questions)
        println(data)
//        questions.forEach { println(data) }
    }


    fun parseQuestions(input: String): List<QaDetail> {
        val questionRegex =
            """(\d+)\.\s+"(.*?)"\s+Answers:\s+a\) (.*?) b\) (.*?) c\) (.*?) d\) (.*?) \(Correct Answer: (.)\)""".toRegex()
        return questionRegex.findAll(input).map {
            val (number, topic, a, b, c, d, answer) = it.destructured
            QaDetail(
                a = a,
                answer = if (answer == "a") 1 else if (answer == "b") 2 else if (answer == "c") 3 else 4,
                b = b,
                c = c,
                d = d,
                topic = topic,
            )
        }.toList()
    }
}