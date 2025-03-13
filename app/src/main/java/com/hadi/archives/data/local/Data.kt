package com.hadi.archives.data.local

import com.hadi.archives.R
import com.hadi.archives.data.model.Book
import com.hadi.archives.data.model.Slider

fun getAllBooks() = listOf<Book>(
    Book(
        id = "the_psychology_of_money",
        title = "The Psychology of Money",
        author = "Morgan Housel",
        description = "Timeless lessons on wealth, greed, and happiness doing well with money isn?t necessarily about what you know. It?s about how you behave. And behavior is hard to teach, even to really smart people. How to manage money, invest it, and make business decisions are typically considered to involve a lot of mathematical calculations, where data and formulae tell us exactly what to do. But in the real world, people don?t make financial decisions on a spreadsheet. They make them at the dinner table, or in a meeting room, where personal history, your unique view of the world, ego, pride, marketing, and odd incentives are scrambled together. In the psychology of money, the author shares 19 short stories exploring the strange ways people think about money and teaches you how to make better sense of one of life?s most important matters.",
        imageUrl = "https://images-na.ssl-images-amazon.com/images/I/71g2ednj0JL.jpg",
        pageCount = 252,
        language = "English",
        rating = 4.6,
        publisher = "Jaico Publishing House",
        category = "Life"
    ),
    Book(
        id = "the_right_choice",
        title = "The Right Choice",
        author = "Shiv Shivakumar",
        description = "Should money be the primary factor in picking a job? When do I pursue an MBA or a second MBA? Should I switch industries to move ahead?\n" + "The Right Choice delves deep into the ten frequently faced dilemmas in a person's career, such as the ones listed above. The author shares his wisdom and experiences from his illustrious career as one of India Inc's longest-serving CEOs. In his trademark straightforward and lucid style, he shares lessons and learnings on each of the ten dilemmas. The book also contains insights and perspectives from twenty-four highly experienced professionals.\n" + "A successful career is not a straight line; it has many twists and turns where you are faced with difficult choices. Practical and inspiring, The Right Choiceis a must read corporate management book and a career guide that will help you navigate these difficult situations-and win in your career.",
        imageUrl = "https://images-na.ssl-images-amazon.com/images/I/71+MYOme7zL.jpg",
        pageCount = 240,
        language = "English",
        rating = 4.8,
        publisher = "Penguin Portfolio",
        category = "Life"
    ),
    Book(
        id = "the_atomic_habits",
        title = "Atomic Habits",
        author = "James Clear",
        description = "‘A supremely practical and useful book. James Clear distils the most fundamental information about habit formation, so you can accomplish more by focusing on less. ’ Mark Manson, author of The Subtle Art of Not Giving A F*ck________________________________People say when you want to change your life, you need to set big goals. But they’re wrong. World-renowned habits expert James Clear has discovered a simpler system for transforming your life. He knows that lasting change comes from the compound effect of hundreds of small decisions – doing two push-ups a day, waking up five minutes early, or holding a single short phone call. He calls them atomic habits. In this ground-breaking book, Clear reveals how these tiny changes will help you get 1 percent better every day. He uncovers a handful of simple life hacks (the forgotten art of Habit Stacking, the unexpected power of the Two Minute Rule, or the trick to entering the Goldilocks Zone) and delves into cutting-edge psychology and neuroscience to explain why they matter. Along the way, he tells inspiring stories of Olympic gold medalists, leading CEOs and distinguished scientists who have used the science of small habits to stay productive, motivated and happy. These small changes will have a revolutionary effect on your career, your relationships and your life. ________________________________‘James Clear has spent years honing the art and studying the science of habits. This engaging, hands-on book is the guide you need to break bad routines and make good ones. ’ Adam Grant, author of Originals‘A special book that will change how you approach your day and live your life. ’ Ryan Holiday, author of The Obstacle is the Way",
        imageUrl = "https://images-na.ssl-images-amazon.com/images/I/91bYsX41DVL.jpg",
        pageCount = 288,
        language = "English",
        rating = 4.8,
        publisher = "Random House Business Books",
        category = "Life"
    ),
    Book(
        id = "the_subtle_art_of_not_giving_a_f*ck",
        title = "The Subtle Art of Not Giving a F*ck",
        author = "Mark Manson",
        description = "In this generation-defining self-help guide, a superstar blogger cuts through the crap to show us how to stop trying to be “positive” all the time so that we can truly become better, happier people\n" + "For decades, we’ve been told that positive thinking is the key to a happy, rich life. “Fuck positivity,” Mark Manson says. “Let’s be honest, shit is fucked and we have to live with it.” In his wildly popular Internet blog, Manson doesn’t sugar-coat or equivocate. He tells it like it is—a dose of raw, refreshing, honest truth that is sorely lacking today. The Subtle Art of Not Giving a F**k is his antidote to the coddling, let’s-all-feel-good mind-set that has infected\n" + "American society and spoiled a generation, rewarding them with gold medals just for showing up.\n" + "Manson makes the argument, backed both by academic research and well-timed poop jokes, that improving our lives hinges not on our ability to turn lemons into lemonade, but on learning to stomach lemons better. Human beings are flawed and limited—“not everybody can be extraordinary, there are winners and losers in society and some of it is not fair or your fault.” Manson advises us to get to know our limitations and accept them. Once we embrace\n" + "our fears, faults and uncertainties, once we stop running and avoiding and start confronting painful truths, we can begin to find the courage, perseverance, honesty, responsibility, curiosity and forgiveness we seek.\n" + "There are only so many things we can give a fuck about so we need to figure out which ones really matter, Manson makes clear. While money is nice, caring about what you do with your life is better, because true wealth is about experience.\n" + "A much-needed grab-you-by-the-shoulders-and-look-you-in the-eye moment of real talk, filled with entertaining stories and profane, ruthless humor, The Subtle Art of Not Giving a F**k is a refreshing slap for a generation to help them truly lead contented, grounded lives.",
        imageUrl = "https://images-na.ssl-images-amazon.com/images/I/814jC+rODgL.jpg",
        pageCount = 224,
        language = "English",
        rating = 4.8,
        publisher = "Harper Collins",
        category = "Life"
    ),
    Book(
        id = "the_time_machine",
        title = "The Time Machine",
        author = "H. G. Wells",
        description = "A compelling science fiction, the Time Machine is a first-hand account of a Time Traveler's journey into the future. a pull of the lever and the machine sends him to the year 802,701, when humanity has split into two bizarre races?the ethereal Eloi and the subterranean Morlocks. Here, his machine is stolen and with the help of Weena, an Eloi he saved from drowning, the traveler is able to retrieve it. Whizzing thirty million years further into the future, he finds a slowly dying earth, where the bloated red sun sits motionless in the sky and the only sign of life is a black blob with tentacles.He returns to the Victorian time, overwhelmed, just three hours after he originally left..Credited with inventing the time machine in this masterpiece, the provocative insight of H. G. Wells continues to enthrall the readers. the Time Machine has since been adapted into many feature films and television series and has inspired many more works of fiction.",
        imageUrl = "https://images-na.ssl-images-amazon.com/images/I/51WLfY9mc5L.jpg",
        pageCount = 144,
        language = "English",
        rating = 4.7,
        publisher = "Fingerprint! Publishing",
        category = "Science Fiction"
    ),
    Book(
        id = "red_world",
        title = "Red World - The Genesis",
        author = "Upasana Majumdar",
        description = "Red World - The Genesis explores the inception of civilization on the red planet Mars. An intriguing tale that brilliantly navigates the layered realms of human emotions against the backdrop of the first Martian society. Narrated by relatable characters and driven by fantastic innovations in a futuristic society, this gripping story explores the motivation for a new home planet, and what happens when all does not go as planned. Science has catalyzed the evolution of human society, but it has also promoted inequality and exploitation through systemic biases and discrimination across countries and cultures...\nWill this new Red World be able to beat Martian hostilities to achieve a functional society? Or will the settlers succumb to the same social pitfalls that have plagued human lives for centuries? Hop onto this fast-paced journey into a futuristic world to find out...",
        imageUrl = "https://images-na.ssl-images-amazon.com/images/I/61gnnwNOxfL.jpg",
        pageCount = 120,
        language = "English",
        rating = 4.4,
        publisher = "White Falcon Publishing",
        category = "Fiction"
    ),
    Book(
        id = "the_martian",
        title = "The Martian",
        author = "Andy Weir",
        description = "I'm stranded on Mars.\n" + "I have no way to communicate with Earth.\n" + "I'm in a habitat designed to last 31 days.\n" + "If the oxygenator breaks down, I'll suffocate. If the water reclaimer breaks down, I'll die of thirst. If the hab breaches, I'll just kind of explode. If none of those things happen, I'll eventually run out of food and starve to death.\n" + "So yeah. I'm screwed.",
        imageUrl = "https://images-na.ssl-images-amazon.com/images/I/81V3ODP5MJL.jpg",
        pageCount = 125,
        language = "English",
        rating = 4.7,
        publisher = "Leadstart Publishing Pvt Ltd",
        category = "Science"
    ),
    Book(
        id = "black_holes",
        title = "Black Holes: The Reith Lectures",
        author = "Stephen Hawking",
        description = "?It is said that fact is sometimes stranger than fiction, and nowhere is that more true than in the case of black holes. Black holes are stranger than anything dreamed up by science fiction writers.?In 2016 Professor Stephen Hawking delivered the BBC Reith Lectures on a subject that fascinated him for decades ? black holes.In these flagship lectures the legendary physicist argued that if we could only understand black holes and how they challenge the very nature of space and time, we could unlock the secrets of the universe.",
        imageUrl = "https://images-na.ssl-images-amazon.com/images/I/91V2mnP754L.jpg",
        pageCount = 80,
        language = "English",
        rating = 4.8,
        publisher = "Bantam",
        category = "Science Fiction"
    ),
    Book(
        id = "the_art_of_management",
        title = "The Art of Management",
        author = "Shiv Shivakumar",
        description = "Careers are changing, and the capabilities required to stay relevant are changing even more rapidly. We seem to have endless choices, at least at the beginning of a career, but these start narrowing after middle management. How does one think about one's own life and career in this changing decade?\n" + "The whole discipline of career management now has three elements to it:\n" + "Managing yourself;\n" + "Managing your team; and\n" + "Managing your business\n" + "In this book, Shiv Shivakumar points out that today, unlike in the past, all the three elements are your responsibility. With in-depth interviews with top leaders across the spectrum and an insightful foreword by Sachin Tendulkar, The Art of Management is a must-read.",
        imageUrl = "https://images-na.ssl-images-amazon.com/images/I/51YVZwbnrTL.jpg",
        pageCount = 288,
        language = "English",
        rating = 4.8,
        publisher = "Penguin Portfolio",
        category = "Management"
    ),
    Book(
        id = "the_lean_startup",
        title = "The Lean Startup: How Today's Entrepreneurs Use Continuous Innovation to Create Radically Successful Businesses",
        author = "Eric Ries",
        description = "The Lean Startup introduces a systematic, scientific approach for creating and managing successful startups. Eric Ries teaches entrepreneurs how to steer, adapt, and adjust their products before any significant investments in marketing or development are made. The core concept is to rapidly test ideas, validate assumptions, and iterate until a business has found a viable product-market fit.",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTwfdt7voRXE4f7r3nkz4-OOsXQ1iybqkOm2A&s",
        pageCount = 336,
        language = "English",
        rating = 4.6,
        publisher = "Crown Business",
        category = "Life"
    ),
    Book(
        id = "lean_in",
        title = "Lean In: Women, Work, and the Will to Lead",
        author = "Sheryl Sandberg",
        description = "In Lean In, Sheryl Sandberg explores the challenges women face in the workplace and offers practical advice on how they can achieve their career goals while balancing family and personal life. Sandberg's perspective is rooted in her experiences as a Silicon Valley executive, where she worked her way to the top, and she encourages women to embrace ambition, self-confidence, and leadership.",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRDglmjRaPBUApCgT4vT4zAuekZr1mS5j__9w&s",
        pageCount = 240,
        language = "English",
        rating = 4.6,
        publisher = "Knopf",
        category = "Management"
    ),
    Book(
        id = "start_with_why",
        title = "Start with Why: How Great Leaders Inspire Everyone to Take Action",
        author = "Simon Sinek",
        description = "In Start with Why, Simon Sinek explores the idea that the most successful companies and leaders are those who can articulate their 'Why'—the deeper purpose or belief that inspires them to do what they do. Sinek demonstrates how organizations like Apple and leaders like Martin Luther King Jr. have had a lasting impact by starting with 'Why' and inspiring others to follow their example.",
        imageUrl = "https://m.media-amazon.com/images/I/71NBZIExBCL._AC_UF894,1000_QL80_.jpg",
        pageCount = 256,
        language = "English",
        rating = 4.7,
        publisher = "Penguin Group",
        category = "Leadership"
    ),
    Book(
        id = "rework",
        title = "Rework: Change the Way You Work Forever",
        author = "Jason Fried & David Heinemeier Hansson",
        description = "Rework challenges the traditional norms of how businesses are run and offers a fresh perspective on productivity, creativity, and work-life balance. The authors advocate for a simpler, more efficient approach to business, encouraging entrepreneurs and managers to focus on what truly matters and to avoid unnecessary complexity.",
        imageUrl = "https://www.everafterbooks.uk/cdn/shop/files/9780091929787.jpg?v=1705687915&width=600",
        pageCount = 288,
        language = "English",
        rating = 4.6,
        publisher = "Crown Business",
        category = "Business"
    ),
    Book(
        id = "the_5_am_club",
        title = "The 5 AM Club: Own Your Morning. Elevate Your Life.",
        author = "Robin Sharma",
        description = "The 5 AM Club teaches the principles of waking up early and creating a morning routine that helps individuals set their day up for success. Robin Sharma shares strategies to help readers rise above mediocrity by using the first few hours of the day to focus on health, productivity, and personal development.",
        imageUrl = "https://m.media-amazon.com/images/I/41jBgBcYh6L._SY445_SX342_.jpg",
        pageCount = 320,
        language = "English",
        rating = 4.6,
        publisher = "HarperOne",
        category = "Self-Help"
    ),
    Book(
        id = "dare_to_lead",
        title = "Dare to Lead: Brave Work. Tough Conversations. Whole Hearts.",
        author = "Brené Brown",
        description = "In Dare to Lead, Brené Brown brings her research on vulnerability, courage, and leadership into the workplace, showing how leaders can create a culture of trust and innovation by being authentic and open. Brown emphasizes that the best leaders are those who embrace vulnerability, make tough decisions, and foster inclusive environments where employees feel valued and empowered.",
        imageUrl = "https://m.media-amazon.com/images/I/41KwzXq2lgL._SY445_SX342_.jpg",
        pageCount = 320,
        language = "English",
        rating = 4.8,
        publisher = "Random House",
        category = "Leadership"
    ),
    Book(
        id = "dune",
        title = "Dune",
        author = "Frank Herbert",
        description = "Set in a distant future amidst a huge interstellar empire, Dune follows young Paul Atreides as he navigates a dangerous political and ecological landscape on the desert planet Arrakis. With themes of politics, religion, and power, this classic novel is widely regarded as one of the greatest sci-fi books of all time.",
        imageUrl = "https://m.media-amazon.com/images/I/41JVFor1FpL._SY445_SX342_.jpg",
        pageCount = 896,
        language = "English",
        rating = 4.8,
        publisher = "Ace",
        category = "Science Fiction"
    ),
    Book(
        id = "foundation",
        title = "Foundation",
        author = "Isaac Asimov",
        description = "In this groundbreaking sci-fi classic, mathematician Hari Seldon develops 'psychohistory,' a way to predict the future of large civilizations. As the Galactic Empire crumbles, he sets up the Foundation to preserve knowledge and shorten the dark age to come.",
        imageUrl = "https://m.media-amazon.com/images/I/81LT+V9G4IL._SY466_.jpg",
        pageCount = 296,
        language = "English",
        rating = 4.7,
        publisher = "Spectra",
        category = "Science Fiction"
    ),
    Book(
        id = "neuromancer",
        title = "Neuromancer",
        author = "William Gibson",
        description = "A cyberpunk masterpiece that introduced the concept of 'cyberspace,' Neuromancer follows Case, a washed-up hacker hired for a mysterious job that takes him deep into a world of AI, corporate espionage, and virtual reality.",
        imageUrl = "https://m.media-amazon.com/images/I/51enxBYbCeL._SY445_SX342_.jpg",
        pageCount = 288,
        language = "English",
        rating = 4.5,
        publisher = "Ace",
        category = "Cyberpunk"
    ),
    Book(
        id = "the_martian",
        title = "The Martian",
        author = "Andy Weir",
        description = "After being left for dead on Mars, astronaut Mark Watney must rely on his ingenuity and humor to survive on the barren planet while awaiting rescue. This thrilling and scientifically accurate novel is packed with suspense and humor.",
        imageUrl = "https://m.media-amazon.com/images/I/41VrPspUvWL._SY445_SX342_.jpg",
        pageCount = 384,
        language = "English",
        rating = 4.7,
        publisher = "Crown",
        category = "Science Fiction"
    ),
    Book(
        id = "the_left_hand_of_darkness",
        title = "The Left Hand of Darkness",
        author = "Ursula K. Le Guin",
        description = "A human emissary is sent to the planet Gethen, where the inhabitants have no fixed gender. Le Guin explores themes of gender, politics, and culture in this thought-provoking science fiction novel.",
        imageUrl = "https://m.media-amazon.com/images/I/514gzABfjwL._SY522_.jpg",
        pageCount = 304,
        language = "English",
        rating = 4.6,
        publisher = "Ace",
        category = "Science Fiction"
    ),
    Book(
        id = "snow_crash",
        title = "Snow Crash",
        author = "Neal Stephenson",
        description = "A fast-paced cyberpunk novel that combines hacking, virtual reality, ancient mythology, and dystopian themes. Hiro Protagonist, a hacker and pizza delivery guy, gets caught in a dangerous conspiracy involving a new virtual drug called Snow Crash.",
        imageUrl = "https://m.media-amazon.com/images/I/51NmXz5YD3L._SY445_SX342_.jpg",
        pageCount = 480,
        language = "English",
        rating = 4.5,
        publisher = "Spectra",
        category = "Cyberpunk"
    ),
    Book(
        id = "hyperion",
        title = "Hyperion",
        author = "Dan Simmons",
        description = "Structured like The Canterbury Tales, this novel follows seven pilgrims traveling to the distant world of Hyperion, each telling their own story. Filled with mystery, deep characters, and philosophical themes, it’s a must-read for sci-fi fans.",
        imageUrl = "https://m.media-amazon.com/images/I/71Ezi50SKwL._SY522_.jpg",
        pageCount = 482,
        language = "English",
        rating = 4.6,
        publisher = "Spectra",
        category = "Science Fiction"
    ),
    Book(
        id = "rich_dad_poor_dad",
        title = "Rich Dad Poor Dad",
        author = "Robert Kiyosaki",
        description = "A classic personal finance book that contrasts the money mindsets of the author's 'rich dad' and 'poor dad,' offering lessons on wealth-building and financial independence.",
        imageUrl = "https://store.richdad.com/cdn/shop/files/31_02261117-2f58-4db1-b52e-1f990edee3af.png?v=1741843619",
        pageCount = 336,
        language = "English",
        rating = 4.7,
        publisher = "Plata Publishing",
        category = "Finance"
    )
)

fun getManagementBooks() = listOf<Book>(
    Book(
        id = "the_psychology_of_money",
        title = "The Psychology of Money",
        author = "Morgan Housel",
        description = "Timeless lessons on wealth, greed, and happiness doing well with money isn?t necessarily about what you know. It?s about how you behave. And behavior is hard to teach, even to really smart people. How to manage money, invest it, and make business decisions are typically considered to involve a lot of mathematical calculations, where data and formulae tell us exactly what to do. But in the real world, people don?t make financial decisions on a spreadsheet. They make them at the dinner table, or in a meeting room, where personal history, your unique view of the world, ego, pride, marketing, and odd incentives are scrambled together. In the psychology of money, the author shares 19 short stories exploring the strange ways people think about money and teaches you how to make better sense of one of life?s most important matters.",
        imageUrl = "https://images-na.ssl-images-amazon.com/images/I/71g2ednj0JL.jpg",
        pageCount = 252,
        language = "English",
        rating = 4.6,
        publisher = "Jaico Publishing House",
        category = "Life"
    ),
    Book(
        id = "the_right_choice",
        title = "The Right Choice",
        author = "Shiv Shivakumar",
        description = "Should money be the primary factor in picking a job? When do I pursue an MBA or a second MBA? Should I switch industries to move ahead?\n" + "The Right Choice delves deep into the ten frequently faced dilemmas in a person's career, such as the ones listed above. The author shares his wisdom and experiences from his illustrious career as one of India Inc's longest-serving CEOs. In his trademark straightforward and lucid style, he shares lessons and learnings on each of the ten dilemmas. The book also contains insights and perspectives from twenty-four highly experienced professionals.\n" + "A successful career is not a straight line; it has many twists and turns where you are faced with difficult choices. Practical and inspiring, The Right Choiceis a must read corporate management book and a career guide that will help you navigate these difficult situations-and win in your career.",
        imageUrl = "https://images-na.ssl-images-amazon.com/images/I/71+MYOme7zL.jpg",
        pageCount = 240,
        language = "English",
        rating = 4.8,
        publisher = "Penguin Portfolio",
        category = "Life"
    ),
    Book(
        id = "the_atomic_habits",
        title = "Atomic Habits",
        author = "James Clear",
        description = "‘A supremely practical and useful book. James Clear distils the most fundamental information about habit formation, so you can accomplish more by focusing on less. ’ Mark Manson, author of The Subtle Art of Not Giving A F*ck________________________________People say when you want to change your life, you need to set big goals. But they’re wrong. World-renowned habits expert James Clear has discovered a simpler system for transforming your life. He knows that lasting change comes from the compound effect of hundreds of small decisions – doing two push-ups a day, waking up five minutes early, or holding a single short phone call. He calls them atomic habits. In this ground-breaking book, Clear reveals how these tiny changes will help you get 1 percent better every day. He uncovers a handful of simple life hacks (the forgotten art of Habit Stacking, the unexpected power of the Two Minute Rule, or the trick to entering the Goldilocks Zone) and delves into cutting-edge psychology and neuroscience to explain why they matter. Along the way, he tells inspiring stories of Olympic gold medalists, leading CEOs and distinguished scientists who have used the science of small habits to stay productive, motivated and happy. These small changes will have a revolutionary effect on your career, your relationships and your life. ________________________________‘James Clear has spent years honing the art and studying the science of habits. This engaging, hands-on book is the guide you need to break bad routines and make good ones. ’ Adam Grant, author of Originals‘A special book that will change how you approach your day and live your life. ’ Ryan Holiday, author of The Obstacle is the Way",
        imageUrl = "https://images-na.ssl-images-amazon.com/images/I/91bYsX41DVL.jpg",
        pageCount = 288,
        language = "English",
        rating = 4.8,
        publisher = "Random House Business Books",
        category = "Life"
    ),
    Book(
        id = "the_subtle_art_of_not_giving_a_f*ck",
        title = "The Subtle Art of Not Giving a F*ck",
        author = "Mark Manson",
        description = "In this generation-defining self-help guide, a superstar blogger cuts through the crap to show us how to stop trying to be “positive” all the time so that we can truly become better, happier people\n" + "For decades, we’ve been told that positive thinking is the key to a happy, rich life. “Fuck positivity,” Mark Manson says. “Let’s be honest, shit is fucked and we have to live with it.” In his wildly popular Internet blog, Manson doesn’t sugar-coat or equivocate. He tells it like it is—a dose of raw, refreshing, honest truth that is sorely lacking today. The Subtle Art of Not Giving a F**k is his antidote to the coddling, let’s-all-feel-good mind-set that has infected\n" + "American society and spoiled a generation, rewarding them with gold medals just for showing up.\n" + "Manson makes the argument, backed both by academic research and well-timed poop jokes, that improving our lives hinges not on our ability to turn lemons into lemonade, but on learning to stomach lemons better. Human beings are flawed and limited—“not everybody can be extraordinary, there are winners and losers in society and some of it is not fair or your fault.” Manson advises us to get to know our limitations and accept them. Once we embrace\n" + "our fears, faults and uncertainties, once we stop running and avoiding and start confronting painful truths, we can begin to find the courage, perseverance, honesty, responsibility, curiosity and forgiveness we seek.\n" + "There are only so many things we can give a fuck about so we need to figure out which ones really matter, Manson makes clear. While money is nice, caring about what you do with your life is better, because true wealth is about experience.\n" + "A much-needed grab-you-by-the-shoulders-and-look-you-in the-eye moment of real talk, filled with entertaining stories and profane, ruthless humor, The Subtle Art of Not Giving a F**k is a refreshing slap for a generation to help them truly lead contented, grounded lives.",
        imageUrl = "https://images-na.ssl-images-amazon.com/images/I/814jC+rODgL.jpg",
        pageCount = 224,
        language = "English",
        rating = 4.8,
        publisher = "Harper Collins",
        category = "Life"
    ),
    Book(
        id = "the_lean_startup",
        title = "The Lean Startup: How Today's Entrepreneurs Use Continuous Innovation to Create Radically Successful Businesses",
        author = "Eric Ries",
        description = "The Lean Startup introduces a systematic, scientific approach for creating and managing successful startups. Eric Ries teaches entrepreneurs how to steer, adapt, and adjust their products before any significant investments in marketing or development are made. The core concept is to rapidly test ideas, validate assumptions, and iterate until a business has found a viable product-market fit.",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTwfdt7voRXE4f7r3nkz4-OOsXQ1iybqkOm2A&s",
        pageCount = 336,
        language = "English",
        rating = 4.6,
        publisher = "Crown Business",
        category = "Business"
    ),
    Book(
        id = "lean_in",
        title = "Lean In: Women, Work, and the Will to Lead",
        author = "Sheryl Sandberg",
        description = "In Lean In, Sheryl Sandberg explores the challenges women face in the workplace and offers practical advice on how they can achieve their career goals while balancing family and personal life. Sandberg's perspective is rooted in her experiences as a Silicon Valley executive, where she worked her way to the top, and she encourages women to embrace ambition, self-confidence, and leadership.",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRDglmjRaPBUApCgT4vT4zAuekZr1mS5j__9w&s",
        pageCount = 240,
        language = "English",
        rating = 4.6,
        publisher = "Knopf",
        category = "Management"
    ),
    Book(
        id = "start_with_why",
        title = "Start with Why: How Great Leaders Inspire Everyone to Take Action",
        author = "Simon Sinek",
        description = "In Start with Why, Simon Sinek explores the idea that the most successful companies and leaders are those who can articulate their 'Why'—the deeper purpose or belief that inspires them to do what they do. Sinek demonstrates how organizations like Apple and leaders like Martin Luther King Jr. have had a lasting impact by starting with 'Why' and inspiring others to follow their example.",
        imageUrl = "https://m.media-amazon.com/images/I/71NBZIExBCL._AC_UF894,1000_QL80_.jpg",
        pageCount = 256,
        language = "English",
        rating = 4.7,
        publisher = "Penguin Group",
        category = "Leadership"
    ),
    Book(
        id = "rework",
        title = "Rework: Change the Way You Work Forever",
        author = "Jason Fried & David Heinemeier Hansson",
        description = "Rework challenges the traditional norms of how businesses are run and offers a fresh perspective on productivity, creativity, and work-life balance. The authors advocate for a simpler, more efficient approach to business, encouraging entrepreneurs and managers to focus on what truly matters and to avoid unnecessary complexity.",
        imageUrl = "https://www.everafterbooks.uk/cdn/shop/files/9780091929787.jpg?v=1705687915&width=600",
        pageCount = 288,
        language = "English",
        rating = 4.6,
        publisher = "Crown Business",
        category = "Business"
    ),
    Book(
        id = "the_5_am_club",
        title = "The 5 AM Club: Own Your Morning. Elevate Your Life.",
        author = "Robin Sharma",
        description = "The 5 AM Club teaches the principles of waking up early and creating a morning routine that helps individuals set their day up for success. Robin Sharma shares strategies to help readers rise above mediocrity by using the first few hours of the day to focus on health, productivity, and personal development.",
        imageUrl = "https://m.media-amazon.com/images/I/41jBgBcYh6L._SY445_SX342_.jpg",
        pageCount = 320,
        language = "English",
        rating = 4.6,
        publisher = "HarperOne",
        category = "Self-Help"
    ),
    Book(
        id = "dare_to_lead",
        title = "Dare to Lead: Brave Work. Tough Conversations. Whole Hearts.",
        author = "Brené Brown",
        description = "In Dare to Lead, Brené Brown brings her research on vulnerability, courage, and leadership into the workplace, showing how leaders can create a culture of trust and innovation by being authentic and open. Brown emphasizes that the best leaders are those who embrace vulnerability, make tough decisions, and foster inclusive environments where employees feel valued and empowered.",
        imageUrl = "https://m.media-amazon.com/images/I/41KwzXq2lgL._SY445_SX342_.jpg",
        pageCount = 320,
        language = "English",
        rating = 4.8,
        publisher = "Random House",
        category = "Leadership"
    )

)

fun getScienceFictions() = listOf<Book>(

    Book(
        id = "the_time_machine",
        title = "The Time Machine",
        author = "H. G. Wells",
        description = "A compelling science fiction, the Time Machine is a first-hand account of a Time Traveler's journey into the future. a pull of the lever and the machine sends him to the year 802,701, when humanity has split into two bizarre races?the ethereal Eloi and the subterranean Morlocks. Here, his machine is stolen and with the help of Weena, an Eloi he saved from drowning, the traveler is able to retrieve it. Whizzing thirty million years further into the future, he finds a slowly dying earth, where the bloated red sun sits motionless in the sky and the only sign of life is a black blob with tentacles.He returns to the Victorian time, overwhelmed, just three hours after he originally left..Credited with inventing the time machine in this masterpiece, the provocative insight of H. G. Wells continues to enthrall the readers. the Time Machine has since been adapted into many feature films and television series and has inspired many more works of fiction.",
        imageUrl = "https://images-na.ssl-images-amazon.com/images/I/51WLfY9mc5L.jpg",
        pageCount = 144,
        language = "English",
        rating = 4.7,
        publisher = "Fingerprint! Publishing",
        category = "Science Fiction"
    ),
    Book(
        id = "red_world",
        title = "Red World - The Genesis",
        author = "Upasana Majumdar",
        description = "Red World - The Genesis explores the inception of civilization on the red planet Mars. An intriguing tale that brilliantly navigates the layered realms of human emotions against the backdrop of the first Martian society. Narrated by relatable characters and driven by fantastic innovations in a futuristic society, this gripping story explores the motivation for a new home planet, and what happens when all does not go as planned. Science has catalyzed the evolution of human society, but it has also promoted inequality and exploitation through systemic biases and discrimination across countries and cultures...\nWill this new Red World be able to beat Martian hostilities to achieve a functional society? Or will the settlers succumb to the same social pitfalls that have plagued human lives for centuries? Hop onto this fast-paced journey into a futuristic world to find out...",
        imageUrl = "https://images-na.ssl-images-amazon.com/images/I/61gnnwNOxfL.jpg",
        pageCount = 120,
        language = "English",
        rating = 4.4,
        publisher = "White Falcon Publishing",
        category = "Fiction"
    ),
    Book(
        id = "the_martian",
        title = "The Martian",
        author = "Andy Weir",
        description = "I'm stranded on Mars.\n" + "I have no way to communicate with Earth.\n" + "I'm in a habitat designed to last 31 days.\n" + "If the oxygenator breaks down, I'll suffocate. If the water reclaimer breaks down, I'll die of thirst. If the hab breaches, I'll just kind of explode. If none of those things happen, I'll eventually run out of food and starve to death.\n" + "So yeah. I'm screwed.",
        imageUrl = "https://images-na.ssl-images-amazon.com/images/I/81V3ODP5MJL.jpg",
        pageCount = 125,
        language = "English",
        rating = 4.7,
        publisher = "Leadstart Publishing Pvt Ltd",
        category = "Science"
    ),
    Book(
        id = "black_holes",
        title = "Black Holes: The Reith Lectures",
        author = "Stephen Hawking",
        description = "?It is said that fact is sometimes stranger than fiction, and nowhere is that more true than in the case of black holes. Black holes are stranger than anything dreamed up by science fiction writers.?In 2016 Professor Stephen Hawking delivered the BBC Reith Lectures on a subject that fascinated him for decades ? black holes.In these flagship lectures the legendary physicist argued that if we could only understand black holes and how they challenge the very nature of space and time, we could unlock the secrets of the universe.",
        imageUrl = "https://images-na.ssl-images-amazon.com/images/I/91V2mnP754L.jpg",
        pageCount = 80,
        language = "English",
        rating = 4.8,
        publisher = "Bantam",
        category = "Science Fiction"
    ),
    Book(
        id = "dune",
        title = "Dune",
        author = "Frank Herbert",
        description = "Set in a distant future amidst a huge interstellar empire, Dune follows young Paul Atreides as he navigates a dangerous political and ecological landscape on the desert planet Arrakis. With themes of politics, religion, and power, this classic novel is widely regarded as one of the greatest sci-fi books of all time.",
        imageUrl = "https://m.media-amazon.com/images/I/41JVFor1FpL._SY445_SX342_.jpg",
        pageCount = 896,
        language = "English",
        rating = 4.8,
        publisher = "Ace",
        category = "Science Fiction"
    ),
    Book(
        id = "foundation",
        title = "Foundation",
        author = "Isaac Asimov",
        description = "In this groundbreaking sci-fi classic, mathematician Hari Seldon develops 'psychohistory,' a way to predict the future of large civilizations. As the Galactic Empire crumbles, he sets up the Foundation to preserve knowledge and shorten the dark age to come.",
        imageUrl = "https://m.media-amazon.com/images/I/81LT+V9G4IL._SY466_.jpg",
        pageCount = 296,
        language = "English",
        rating = 4.7,
        publisher = "Spectra",
        category = "Science Fiction"
    ),
    Book(
        id = "neuromancer",
        title = "Neuromancer",
        author = "William Gibson",
        description = "A cyberpunk masterpiece that introduced the concept of 'cyberspace,' Neuromancer follows Case, a washed-up hacker hired for a mysterious job that takes him deep into a world of AI, corporate espionage, and virtual reality.",
        imageUrl = "https://m.media-amazon.com/images/I/51enxBYbCeL._SY445_SX342_.jpg",
        pageCount = 288,
        language = "English",
        rating = 4.5,
        publisher = "Ace",
        category = "Cyberpunk"
    ),
    Book(
        id = "the_martian",
        title = "The Martian",
        author = "Andy Weir",
        description = "After being left for dead on Mars, astronaut Mark Watney must rely on his ingenuity and humor to survive on the barren planet while awaiting rescue. This thrilling and scientifically accurate novel is packed with suspense and humor.",
        imageUrl = "https://m.media-amazon.com/images/I/41VrPspUvWL._SY445_SX342_.jpg",
        pageCount = 384,
        language = "English",
        rating = 4.7,
        publisher = "Crown",
        category = "Science Fiction"
    ),
    Book(
        id = "the_left_hand_of_darkness",
        title = "The Left Hand of Darkness",
        author = "Ursula K. Le Guin",
        description = "A human emissary is sent to the planet Gethen, where the inhabitants have no fixed gender. Le Guin explores themes of gender, politics, and culture in this thought-provoking science fiction novel.",
        imageUrl = "https://m.media-amazon.com/images/I/514gzABfjwL._SY522_.jpg",
        pageCount = 304,
        language = "English",
        rating = 4.6,
        publisher = "Ace",
        category = "Science Fiction"
    ),
    Book(
        id = "snow_crash",
        title = "Snow Crash",
        author = "Neal Stephenson",
        description = "A fast-paced cyberpunk novel that combines hacking, virtual reality, ancient mythology, and dystopian themes. Hiro Protagonist, a hacker and pizza delivery guy, gets caught in a dangerous conspiracy involving a new virtual drug called Snow Crash.",
        imageUrl = "https://m.media-amazon.com/images/I/51NmXz5YD3L._SY445_SX342_.jpg",
        pageCount = 480,
        language = "English",
        rating = 4.5,
        publisher = "Spectra",
        category = "Cyberpunk"
    ),
    Book(
        id = "hyperion",
        title = "Hyperion",
        author = "Dan Simmons",
        description = "Structured like The Canterbury Tales, this novel follows seven pilgrims traveling to the distant world of Hyperion, each telling their own story. Filled with mystery, deep characters, and philosophical themes, it’s a must-read for sci-fi fans.",
        imageUrl = "https://m.media-amazon.com/images/I/71Ezi50SKwL._SY522_.jpg",
        pageCount = 482,
        language = "English",
        rating = 4.6,
        publisher = "Spectra",
        category = "Science Fiction"
    )
)

fun getRecentRead() = Book(
    id = "rich_dad_poor_dad",
    title = "Rich Dad Poor Dad",
    author = "Robert Kiyosaki",
    description = "A classic personal finance book that contrasts the money mindsets of the author's 'rich dad' and 'poor dad,' offering lessons on wealth-building and financial independence.",
    imageUrl = "https://store.richdad.com/cdn/shop/files/31_02261117-2f58-4db1-b52e-1f990edee3af.png?v=1741843619",
    pageCount = 336,
    language = "English",
    rating = 4.7,
    publisher = "Plata Publishing",
    category = "Finance"
)


object SliderData {
    val slides = listOf<Slider>(
        Slider(R.drawable.slide_1,"Sleep is good, he said, and books are better.","George R.R. Martin"),
        Slider(R.drawable.slide_3,"Books are uniquely portable magic.","Walt Disney"),
        Slider(R.drawable.slide_2,"There is no friend as loyal as a book.","Stephen King"),
    )
}
