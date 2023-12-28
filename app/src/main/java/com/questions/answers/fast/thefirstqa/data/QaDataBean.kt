package com.questions.answers.fast.thefirstqa.data

import java.text.FieldPosition

data class QaDataBean(
    val data: List<QaDetail>
)

data class QaDetail(
    val a: String,
    val answer: Int,
    val b: String,
    val c: String,
    val d: String,
    val topic: String
)

data class AnswerDataBean(
    var level: Int = 1,
    var position: Int = 0,
    var species: Int = 0,
    var correctNum:Int = 0,
    var errorNum:Int = 0,
)

const val qAJsonData = """
    {
    "data": [
    {
        "a": "12",
        "answer": 3,
        "b": "18",
        "c": "24",
        "d": "30",
        "topic": "How many hours are there in a day?"
    },
    {
        "a": "Night",
        "answer": 1,
        "b": "Morning",
        "c": "Afternoon",
        "d": "Evening",
        "topic": "What is the opposite of 'day'?"
    },
    {
        "a": "Water",
        "answer": 3,
        "b": "Soil",
        "c": "Sunlight",
        "d": "Wind",
        "topic": "What do plants need to undergo photosynthesis?"
    },
    {
        "a": "Spring",
        "answer": 1,
        "b": "Summer",
        "c": "Autumn",
        "d": "Monsoon",
        "topic": "Which season comes after winter?"
    },
    {
        "a": "3",
        "answer": 2,
        "b": "5",
        "c": "7",
        "d": "10",
        "topic": "How many fingers does a person have on one hand?"
    },
    {
        "a": "Yellow",
        "answer": 1,
        "b": "Red",
        "c": "Orange",
        "d": "White",
        "topic": "What is the color of the sun?"
    },
    {
        "a": "Carbon Dioxide",
        "answer": 3,
        "b": "Nitrogen",
        "c": "Oxygen",
        "d": "Hydrogen",
        "topic": "What is the primary gas that humans breathe in?"
    },
    {
        "a": "Mars",
        "answer": 2,
        "b": "Earth",
        "c": "Neptune",
        "d": "Uranus",
        "topic": "Which planet is known as the 'Blue Planet'?"
    },
    {
        "a": "Tomato",
        "answer": 2,
        "b": "Avocado",
        "c": "Onion",
        "d": "Cilantro",
        "topic": "What is the main ingredient in guacamole?"
    },
    {
        "a": "Saturday",
        "answer": 1,
        "b": "Sunday",
        "c": "Monday",
        "d": "Wednesday",
        "topic": "Which day of the week comes after Thursday?"
    },
    {
        "a": "Condensation",
        "answer": 2,
        "b": "Evaporation",
        "c": "Precipitation",
        "d": "Filtration",
        "topic": "What is the process of water turning into vapor called?"
    },
    {
        "a": "Heart",
        "answer": 3,
        "b": "Liver",
        "c": "Skin",
        "d": "Lungs",
        "topic": "What is the largest organ in the human body?"
    },
    {
        "a": "Tornado",
        "answer": 2,
        "b": "Earthquake",
        "c": "Hurricane",
        "d": "Flood",
        "topic": "Which natural disaster is characterized by shaking of the ground?"
    },
    {
        "a": "Washington, D.C.",
        "answer": 1,
        "b": "New York City",
        "c": "Los Angeles",
        "d": "Chicago",
        "topic": "What is the capital city of the United States?"
    },
    {
        "a": "48",
        "answer": 2,
        "b": "52",
        "c": "56",
        "d": "60",
        "topic": "How many weeks are there in a year?"
    },
    {
        "a": "Banana",
        "answer": 2,
        "b": "Mango",
        "c": "Apple",
        "d": "Orange",
        "topic": "Which fruit is known as the 'king of fruits' and has a strong smell?"
    },
    {
        "a": "Respiration",
        "answer": 2,
        "b": "Photosynthesis",
        "c": "Digestion",
        "d": "Transpiration",
        "topic": "What is the process of plants making their own food through sunlight called?"
    },
    {
        "a": "Oxygen",
        "answer": 4,
        "b": "Nitrogen",
        "c": "Carbon Dioxide",
        "d": "Ozone",
        "topic": "Which gas is responsible for the feeling of freshness in the air after rain?"
    },
    {
        "a": "Elephant",
        "answer": 1,
        "b": "Giraffe",
        "c": "Rhinoceros",
        "d": "Hippopotamus",
        "topic": "What is the largest mammal on land?"
    },
    {
        "a": "Young",
        "answer": 1,
        "b": "Ancient",
        "c": "Senior",
        "d": "Aged",
        "topic": "What is the opposite of 'old'?"
    },
    {
        "a": "Sydney",
        "answer": 3,
        "b": "Melbourne",
        "c": "Canberra",
        "d": "Brisbane",
        "topic": "What is the capital city of Australia?"
    },
    {
        "a": "Venus",
        "answer": 2,
        "b": "Mars",
        "c": "Jupiter",
        "d": "Saturn",
        "topic": "Which planet is known as the 'Red Planet' in our solar system?"
    },
    {
        "a": "Yen",
        "answer": 1,
        "b": "Won",
        "c": "Ringgit",
        "d": "Baht",
        "topic": "What is the currency used in Japan?"
    },
    {
        "a": "Pacific Ocean",
        "answer": 2,
        "b": "Atlantic Ocean",
        "c": "Indian Ocean",
        "d": "Southern Ocean",
        "topic": "In which ocean is the Bermuda Triangle located?"
    },
    {
        "a": "K2",
        "answer": 2,
        "b": "Mount Everest",
        "c": "Kanchenjunga",
        "d": "Lhotse",
        "topic": "What is the tallest mountain in the world?"
    },
    {
        "a": "Oxygen",
        "answer": 1,
        "b": "Gold",
        "c": "Iron",
        "d": "Uranium",
        "topic": "Which element has the chemical symbol 'O' on the periodic table?"
    },
    {
        "a": "Brasília",
        "answer": 1,
        "b": "Rio de Janeiro",
        "c": "São Paulo",
        "d": "Salvador",
        "topic": "What is the capital city of Brazil?"
    },
    {
        "a": "5",
        "answer": 3,
        "b": "6",
        "c": "7",
        "d": "8",
        "topic": "How many continents are there on Earth?"
    },
    {
        "a": "China",
        "answer": 3,
        "b": "South Korea",
        "c": "Japan",
        "d": "Vietnam",
        "topic": "Which country is known as the 'Land of the Rising Sun'?"
    },
    {
        "a": "Elephant",
        "answer": 2,
        "b": "Blue Whale",
        "c": "Giraffe",
        "d": "Gorilla",
        "topic": "What is the largest mammal in the world?"
    },
    {
        "a": "Hurricane",
        "answer": 2,
        "b": "Earthquake",
        "c": "Tornado",
        "d": "Tsunami",
        "topic": "Which natural disaster is measured on the Richter scale?"
    },
    {
        "a": "Berlin",
        "answer": 3,
        "b": "Rome",
        "c": "Paris",
        "d": "Madrid",
        "topic": "What is the capital city of France?"
    },
    {
        "a": "Mars",
        "answer": 2,
        "b": "Venus",
        "c": "Mercury",
        "d": "Jupiter",
        "topic": "Which planet is known as the 'Morning Star' or 'Evening Star'?"
    },
    {
        "a": "1910",
        "answer": 2,
        "b": "1912",
        "c": "1915",
        "d": "1918",
        "topic": "In which year did the Titanic sink?"
    },
    {
        "a": "Euro",
        "answer": 3,
        "b": "Dollar",
        "c": "Pound Sterling",
        "d": "Yen",
        "topic": "What is the currency used in the United Kingdom?"
    },
    {
        "a": "Indian Ocean",
        "answer": 4,
        "b": "Atlantic Ocean",
        "c": "Southern Ocean",
        "d": "Pacific Ocean",
        "topic": "Which ocean is the largest by surface area?"
    },
    {
        "a": "Nitrogen",
        "answer": 2,
        "b": "Oxygen",
        "c": "Carbon Dioxide",
        "d": "Hydrogen",
        "topic": "What is the main component of Earth's atmosphere?"
    },
    {
        "a": "Isaac Newton",
        "answer": 2,
        "b": "Albert Einstein",
        "c": "Galileo Galilei",
        "d": "Stephen Hawking",
        "topic": "Which famous scientist developed the theory of general relativity?"
    },
    {
        "a": "Mexico",
        "answer": 2,
        "b": "Australia",
        "c": "Brazil",
        "d": "Thailand",
        "topic": "In which country is the Great Barrier Reef located?"
    },
    {
        "a": "Sahara Desert",
        "answer": 3,
        "b": "Gobi Desert",
        "c": "Antarctic Desert",
        "d": "Arabian Desert",
        "topic": "What is the largest desert in the world by area?"
    },
    {
        "a": "Rome",
        "answer": 3,
        "b": "Berlin",
        "c": "Paris",
        "d": "Madrid",
        "topic": "What is the capital city of France?"
    },
    {
        "a": "Venus",
        "answer": 2,
        "b": "Mars",
        "c": "Jupiter",
        "d": "Saturn",
        "topic": "Which planet is known as the 'Red Planet' in our solar system?"
    },
    {
        "a": "Won",
        "answer": 2,
        "b": "Yen",
        "c": "Baht",
        "d": "Rupee",
        "topic": "What is the currency of Japan?"
    },
    {
        "a": "Charles Dickens",
        "answer": 2,
        "b": "William Shakespeare",
        "c": "Jane Austen",
        "d": "Mark Twain",
        "topic": "Who wrote 'Romeo and Juliet'?"
    },
    {
        "a": "Atlantic Ocean",
        "answer": 4,
        "b": "Indian Ocean",
        "c": "Southern Ocean",
        "d": "Pacific Ocean",
        "topic": "Which ocean is the largest on Earth?"
    },
    {
        "a": "1492",
        "answer": 1,
        "b": "1607",
        "c": "1776",
        "d": "1812",
        "topic": "In what year did Christopher Columbus first reach the Americas?"
    },
    {
        "a": "Tomato",
        "answer": 2,
        "b": "Avocado",
        "c": "Onion",
        "d": "Cilantro",
        "topic": "What is the main ingredient in guacamole?"
    },
    {
        "a": "Oxygen",
        "answer": 3,
        "b": "Nitrogen",
        "c": "Carbon Dioxide",
        "d": "Hydrogen",
        "topic": "Which gas do plants absorb during photosynthesis?"
    },
    {
        "a": "0",
        "answer": 3,
        "b": "1",
        "c": "2",
        "d": "3",
        "topic": "What is the smallest prime number?"
    },
    {
        "a": "Vincent van Gogh",
        "answer": 2,
        "b": "Leonardo da Vinci",
        "c": "Pablo Picasso",
        "d": "Michelangelo",
        "topic": "Who painted the 'Mona Lisa'?"
    },
    {
        "a": "Heart",
        "answer": 3,
        "b": "Liver",
        "c": "Skin",
        "d": "Lungs",
        "topic": "What is the largest organ in the human body?"
    },
    {
        "a": "Condensation",
        "answer": 2,
        "b": "Evaporation",
        "c": "Precipitation",
        "d": "Filtration",
        "topic": "What is the process of water turning into vapor called?"
    },
    {
        "a": "Gd",
        "answer": 2,
        "b": "Au",
        "c": "Ag",
        "d": "Fe",
        "topic": "What is the chemical symbol for gold?"
    },
    {
        "a": "Mars",
        "answer": 2,
        "b": "Earth",
        "c": "Neptune",
        "d": "Uranus",
        "topic": "Which planet is known as the 'Blue Planet'?"
    },
    {
        "a": "1905",
        "answer": 2,
        "b": "1912",
        "c": "1923",
        "d": "1930",
        "topic": "In what year did the Titanic sink?"
    },
    {
        "a": "J.R.R. Tolkien",
        "answer": 2,
        "b": "J.K. Rowling",
        "c": "George R.R. Martin",
        "d": "Suzanne Collins",
        "topic": "Who is the author of the Harry Potter book series?"
    },
    {
        "a": "Tofu",
        "answer": 3,
        "b": "Seaweed",
        "c": "Miso paste",
        "d": "Rice",
        "topic": "What is the main ingredient in traditional Japanese miso soup?"
    },
    {
        "a": "300,000 km/s",
        "answer": 1,
        "b": "500,000 km/s",
        "c": "700,000 km/s",
        "d": "900,000 km/s",
        "topic": "What is the speed of light in a vacuum?"
    },
    {
        "a": "Isaac Newton",
        "answer": 2,
        "b": "Albert Einstein",
        "c": "Galileo Galilei",
        "d": "Stephen Hawking",
        "topic": "Which famous scientist developed the theory of general relativity?"
    },
    {
        "a": "Sydney",
        "answer": 3,
        "b": "Melbourne",
        "c": "Canberra",
        "d": "Brisbane",
        "topic": "What is the capital city of Australia?"
    },
    {
        "a": "Hurricane",
        "answer": 3,
        "b": "Tornado",
        "c": "Earthquake",
        "d": "Flood",
        "topic": "Which natural disaster is measured on the Richter scale?"
    },
    {
        "a": "Elephant",
        "answer": 2,
        "b": "Blue whale",
        "c": "Giraffe",
        "d": "Polar bear",
        "topic": "What is the largest mammal in the world?"
    },
    {
        "a": "Mars",
        "answer": 2,
        "b": "Venus",
        "c": "Mercury",
        "d": "Jupiter",
        "topic": "Which planet is known as the 'Morning Star' or 'Evening Star'?"
    },
    {
        "a": "O2",
        "answer": 3,
        "b": "CO2",
        "c": "H2O",
        "d": "N2",
        "topic": "What is the chemical symbol for water?"
    },
    {
        "a": "Oxygen",
        "answer": 1,
        "b": "Nitrogen",
        "c": "Carbon Dioxide",
        "d": "Hydrogen",
        "topic": "Which gas do plants release during photosynthesis?"
    },
    {
        "a": "1676",
        "answer": 3,
        "b": "1756",
        "c": "1776",
        "d": "1865",
        "topic": "In what year did the United States declare its independence?"
    },
    {
        "a": "Freezing",
        "answer": 4,
        "b": "Melting",
        "c": "Condensation",
        "d": "Boiling",
        "topic": "What is the process of a liquid turning into a gas called?"
    },
    {
        "a": "Liver",
        "answer": 2,
        "b": "Kidneys",
        "c": "Heart",
        "d": "Lungs",
        "topic": "Which organ is responsible for filtering blood in the human body?"
    },
    {
        "a": "Yen",
        "answer": 3,
        "b": "Won",
        "c": "Yuan",
        "d": "Ringgit",
        "topic": "What is the currency of China?"
    },
    {
        "a": "F. Scott Fitzgerald",
        "answer": 3,
        "b": "J.D. Salinger",
        "c": "Harper Lee",
        "d": "Ernest Hemingway",
        "topic": "Who wrote 'To Kill a Mockingbird'?"
    },
    {
        "a": "Rice",
        "answer": 1,
        "b": "Seaweed",
        "c": "Tofu",
        "d": "Noodles",
        "topic": "What is the main ingredient in the dish sushi?"
    },
    {
        "a": "1985",
        "answer": 2,
        "b": "1991",
        "c": "2000",
        "d": "2005",
        "topic": "In what year did the Berlin Wall fall, leading to the reunification of Germany?"
    },
    {
        "a": "Atlantic Ocean",
        "answer": 4,
        "b": "Indian Ocean",
        "c": "Southern Ocean",
        "d": "Pacific Ocean",
        "topic": "What is the world's largest ocean?"
    },
    {
        "a": "Oxygen",
        "answer": 2,
        "b": "Nitrogen",
        "c": "Carbon Dioxide",
        "d": "Argon",
        "topic": "Which gas makes up the majority of Earth's atmosphere?"
    },
    {
        "a": "Claude Monet",
        "answer": 2,
        "b": "Vincent van Gogh",
        "c": "Pablo Picasso",
        "d": "Leonardo da Vinci",
        "topic": "Who painted the famous artwork 'Starry Night'?"
    },
    {
        "a": "Buenos Aires",
        "answer": 4,
        "b": "Lima",
        "c": "Rio de Janeiro",
        "d": "Brasília",
        "topic": "What is the capital city of Brazil?"
    },
    {
        "a": "Respiration",
        "answer": 3,
        "b": "Transpiration",
        "c": "Photosynthesis",
        "d": "Digestion",
        "topic": "What is the process of plants making food using sunlight called?"
    },
    {
        "a": "Heart",
        "answer": 2,
        "b": "Liver",
        "c": "Kidneys",
        "d": "Lungs",
        "topic": "Which human organ can regenerate tissue to some extent?"
    },
    {
        "a": "Gd",
        "answer": 2,
        "b": "Au",
        "c": "Ag",
        "d": "Fe",
        "topic": "What is the chemical symbol for gold?"
    },
    {
        "a": "Mars",
        "answer": 2,
        "b": "Moon",
        "c": "Venus",
        "d": "Jupiter",
        "topic": "Which natural satellite orbits the Earth?"
    },
    {
        "a": "Elephant",
        "answer": 1,
        "b": "Giraffe",
        "c": "Rhinoceros",
        "d": "Lion",
        "topic": "What is the largest mammal on land?"
    },
    {
        "a": "Venus",
        "answer": 2,
        "b": "Mars",
        "c": "Jupiter",
        "d": "Saturn",
        "topic": "Which planet is known as the 'Red Planet'?"
    },
    {
        "a": "1905",
        "answer": 2,
        "b": "1912",
        "c": "1920",
        "d": "1931",
        "topic": "In what year did the Titanic sink?"
    },
    {
        "a": "Nucleus",
        "answer": 3,
        "b": "Ribosome",
        "c": "Mitochondria",
        "d": "Endoplasmic reticulum",
        "topic": "What is the powerhouse of the cell?"
    },
    {
        "a": "China",
        "answer": 2,
        "b": "Japan",
        "c": "South Korea",
        "d": "Vietnam",
        "topic": "Which country is known as the 'Land of the Rising Sun'?"
    },
    {
        "a": "Sydney",
        "answer": 3,
        "b": "Melbourne",
        "c": "Canberra",
        "d": "Brisbane",
        "topic": "What is the capital city of Australia?"
    },
    {
        "a": "Isaac Newton",
        "answer": 2,
        "b": "Albert Einstein",
        "c": "Galileo Galilei",
        "d": "Stephen Hawking",
        "topic": "Which famous scientist developed the theory of relativity?"
    },
    {
        "a": "O2",
        "answer": 4,
        "b": "CO2",
        "c": "H2O",
        "d": "O",
        "topic": "What is the chemical symbol for the element oxygen?"
    },
    {
        "a": "Atlantic Ocean",
        "answer": 4,
        "b": "Indian Ocean",
        "c": "Southern Ocean",
        "d": "Pacific Ocean",
        "topic": "Which ocean is the largest on Earth?"
    },
    {
        "a": "Pumping blood",
        "answer": 1,
        "b": "Digesting food",
        "c": "Filtering air",
        "d": "Storing energy",
        "topic": "What is the primary function of the human heart?"
    },
    {
        "a": "Mars",
        "answer": 2,
        "b": "Venus",
        "c": "Mercury",
        "d": "Jupiter",
        "topic": "Which planet is known as the 'Evening Star'?"
    },
    {
        "a": "1676",
        "answer": 3,
        "b": "1756",
        "c": "1776",
        "d": "1865",
        "topic": "In what year did the United States gain its independence from Britain?"
    },
    {
        "a": "Freezing",
        "answer": 4,
        "b": "Melting",
        "c": "Condensation",
        "d": "Boiling",
        "topic": "What is the process of a liquid turning into a gas called?"
    },
    {
        "a": "Oxygen",
        "answer": 3,
        "b": "Nitrogen",
        "c": "Carbon Dioxide",
        "d": "Hydrogen",
        "topic": "Which gas do plants absorb during photosynthesis?"
    },
    {
        "a": "Berlin",
        "answer": 2,
        "b": "Paris",
        "c": "London",
        "d": "Rome",
        "topic": "What is the capital city of France?"
    },
    {
        "a": "Yen",
        "answer": 1,
        "b": "Won",
        "c": "Yuan",
        "d": "Ringgit",
        "topic": "What is the currency of Japan?"
    },
    {
        "a": "William Shakespeare",
        "answer": 1,
        "b": "Charles Dickens",
        "c": "Jane Austen",
        "d": "Mark Twain",
        "topic": "Which famous playwright wrote 'Romeo and Juliet'?"
    },
    {
        "a": "Tomato",
        "answer": 2,
        "b": "Avocado",
        "c": "Onion",
        "d": "Pepper",
        "topic": "What is the main ingredient in guacamole?"
    },
    {
        "a": "Oxygen",
        "answer": 3,
        "b": "Nitrogen",
        "c": "Methane",
        "d": "Hydrogen",
        "topic": "Which gas is responsible for the Earth's greenhouse effect?"
    },
    {
        "a": "Pablo Picasso",
        "answer": 3,
        "b": "Vincent van Gogh",
        "c": "Leonardo da Vinci",
        "d": "Claude Monet",
        "topic": "Who painted the Mona Lisa?"
    }
]
}
    """