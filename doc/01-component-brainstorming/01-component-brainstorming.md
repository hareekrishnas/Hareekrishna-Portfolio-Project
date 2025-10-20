# Portfolio Part 1: Component Brainstorming

- **Name**: <!--  Hareekrishna Shankarganesh
- **Dot Number**: <!-- Shankarganesh.2
- **Due Date**: <!-- 10/20 @ 11:59 PM EST

## Assignment Overview

The overall goal of the portfolio project is to have you design and implement
your own OSU component. There are no limits to what you choose to design and
implement, but your component must fit within the constraints of our software
sequence discipline. In other words, the component must extend from Standard and
must include both a kernel and a secondary interface.

Because this is a daunting project, we will be providing you with a series of
activities to aid in your design decisions. For example, the point of this
assignment is to help you brainstorm a few possible components and get some
feedback. For each of these components, you will need to specify the high-level
design in terms of the software sequence discipline. In other words, you will
describe a component, select a few kernel methods for your component, and select
a few secondary methods to layer on top of your kernel methods.

You are not required to specify contracts at this time. However, you are welcome
to be as detailed as you'd like. More detail means you will be able to get more
detailed feedback, which may help you decide which component to ultimately
implement.

## Assignment Checklist

To be sure you have completed everything on this assignment, we have littered
this document with TODO comments. You can browse all of them in VSCode by
opening the TODOs window from the sidebar. The icon looks like a tree and will
likely have a large number next to it indicating the number of TODOS. You'll
chip away at that number over the course of the semester. However, if you'd
like to remove this number, you can disable it by removing the following
line from the `settings.json` file:

```json
"todo-tree.general.showActivityBarBadge": true,
```

Which is not to be confused with the following setting that adds the counts
to the tree diagram (you may remove this one as well):

```json
"todo-tree.tree.showCountsInTree": true,
```

## Assignment Learning Objectives

Without learning objectives, there really is no clear reason why a particular
assessment or activity exists. Therefore, to be completely transparent, here is
what we're hoping you will learn through this particular aspect of the portfolio
project. Specifically, students should be able to:

1. Integrate their areas of interest in their personal lives and/or careers with
   their knowledge of software design
2. Determine the achievablility of a software design given time constraints
3. Design high-level software components following the software sequence
   discipline

## Assignment Rubric: 10 Points

Again, to be completely transparent, most of the portfolio project, except the
final submission, is designed as a formative assessment. Formative assessments
are meant to provide ongoing feedback in the learning process. Therefore,
the rubric is designed to assess the learning objectives *directly* in a way
that is low stakes—meaning you shouldn't have to worry about the grade. Just
do good work.

| Learning Objective                                                                                        | Subcategory                 | Weight | Missing                                                     | Beginning                                                                              | Developing                                                                                     | Meeting                                                                                 |
| --------------------------------------------------------------------------------------------------------- | --------------------------- | ------ | ----------------------------------------------------------- | -------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| Students should be able to identify their values, interests, and/or goals as they relate to their designs | Metacognitive Memory        | 3      | (0) No attempt to summarize values, interests, and/or goals | (1) A brief description of values, interests, and/or goals is provided but lacks depth | (2) A description of values, interests, and/or goals is provided by are not related to designs | (3) A description of values, interests, and/or goals is provided and relates to designs |
| Students should be able to predict the feasibility of their designs                                       | Metacognitive Understanding | 3      | (0) No attempt to design components that are feasible       | (1) At least one component is feasible                                                 | (2) At least two components are feasible                                                       | (3) All three components are feasible                                                   |
| Students should be able to use the OSU discipline in all three designs                                    | Metacognitive Application   | 4      | (0) No attempt to follow the OSU discipline in designs      | (1) At least one design follows the OSU discipline                                     | (3) At least two designs follow the OSU discipline                                             | (4) All three designs follow the OSU discipline                                         |

Below is further rationale/explanation for the rubric items above:

1. Each design must align with your personal values and long-term
   goals. Because the goal of this project is to help your build out a
   portfolio, you really ought to care about what you're designing. We'll give
   you a chance to share your personal values, interests, and long-term goals
   below.
2. Each design must be achievable over the course of a single
   semester. Don't be afraid to design something very small. There is no shame
   in keeping it simple.
3. Each design must fit within the software sequence discipline. In
   other words, your design should expect to inherit from Standard, and it
   should contain both kernel and secondary methods. Also, null and aliasing
   must be avoided, when possible. The methods themselves must also be in
   justifiable locations, such as kernel or secondary.

## Pre-Assignment

> Before you jump in, we want you to take a moment to share your interests
> below. Use this space to talk about your career goals as well as your personal
> hobbies. These will help you clarify your values before you start
> brainstorming. Plus it helps us get to know you better! Feel free to share
> images in this section.

My interests/hobbies include something related to video games like
spells/abilities and even something banking related as I always liked the
concept of interest rates. My career goals include potentially being a game
designer or someone that creates data visualizations relating to the Finance
industry. With this in mind, I would like to create something with spells or
maybe counting component for this specific portfolio project.

## Assignment

As previously stated, you are tasked with brainstorming 3 possible components.
To aid you in this process, we have provided [some example components][example-components]
that may help you in your brainstorming. All of these components were made at
some point by one of your peers, so you should feel confident that you can
accomplish any of them.

There is no requirement that you use any of the components listed above.
If you want to model something else, go for it! Very common early object
projects usually attempt to model real-world systems like banks, cars,
etc. Make of this whatever seems interesting to you, and keep in mind that
you're just brainstorming right now. You do not have to commit to anything.

### Example Component

To help you brainstorm a few components, we've provided an example below of a
component you already know well: NaturalNumber. We highly recommend that you
mirror the formatting as close as possible in your designs. By following this
format, we can be more confident that your designs will be possible.

- Example Component: `NaturalNumber`
  - **Description**:
    - The purpose of this component is to model a non-negative
      integer. Our intent with this design was to keep a simple kernel that
      provides the minimum functionality needed to represent a natural number.
      Then, we provide more complex mathematical operations in the secondary
      interface.
  - **Kernel Methods**:
    - `void multiplyBy10(int k)`: multiplies `this` by 10 and adds `k`
    - `int divideBy10()`: divides `this` by 10 and reports the remainder
    - `boolean isZero()`: reports whether `this` is zero
  - **Secondary Methods**:
    - `void add(NaturalNumber n)`: adds `n` to `this`
    - `void subtract(NaturalNumber n)`: subtracts `n` from `this`
    - `void multiply(NaturalNumber n)`: multiplies `this` by `n`
    - `NaturalNumber divide(NaturalNumber n)`: divides `this` by `n`, returning
      the remainder
    - ...
  - **Additional Considerations** (*note*: "I don't know" is an acceptable
    answer for each of the following questions):
    - Would this component be mutable? Answer and explain:
      - Yes, basically all OSU components have to be mutable as long as they
        inherit from Standard. `clear`, `newInstance`, and `transferFrom` all
        mutate `this`.
    - Would this component rely on any internal classes (e.g., `Map.Pair`)?
      Answer and explain:
      - No. All methods work with integers or other NaturalNumbers.
    - Would this component need any enums or constants (e.g.,
      `Program.Instruction`)? Answer and explain:
      - Yes. NaturalNumber is base 10, and we track that in a constant called
          `RADIX`.
    - Can you implement your secondary methods using your kernel methods?
      Answer, explain, and give at least one example:
      - Yes. The kernel methods `multiplyBy10` and `divideBy10` can be used to
        manipulate our natural number as needed. For example, to implement
        `increment`, we can trim the last digit off with `divideBy10`, add 1 to
        it, verify that the digit hasn't overflown, and multiply the digit back.
        If the digit overflows, we reset it to zero and recursively call
        `increment`.

Keep in mind that the general idea when putting together these layered designs
is to put the minimal implementation in the kernel. In this case, the kernel is
only responsible for manipulating a digit at a time in the number. The secondary
methods use these manipulations to perform more complex operations like
adding two numbers together.

Also, keep in mind that we don't know the underlying implementation. It would be
completely reasonable to create a `NaturalNumber1L` class which layers the
kernel on top of the existing `BigInteger` class in Java. It would also be
reasonable to implement `NaturalNumber2` on top of `String` as seen in
Project 2. Do not worry about your implementations at this time.

On top of everything above, there is no expectation that you have a perfect
design. Part of the goal of this project is to have you actually use your
component once it's implemented to do something interesting. At which point, you
will likely refine your design to make your implementation easier to use.

### Component Designs

> Please use this section to share your designs.

- Component Design #1: SpellBook
  - *Description**:
    I want to create a component where it would mimic what spells a player has.
    I would like to create a Set of spells that would be able to add to the spell
    book with a power level, remove from the spell book,
    and even check the spell power level. For the secondary methods, I want to
    be able to return spells that are above a certain minimum power level and
    even returning a set with all the spells created.
  - **Kernel Methods**:
    - `void addSpell(String spellName, int powerLevel)`: adds a given spell with
     a power level to the spell book; even updates the power level of the spell
     if it was named the same
    - `String removeSpell(String spell)`: Removes the given spell and returns it
    - `int getPower(String spell)`: reports the power level of the spell
    - `int spellsCount()`: reports the number of spells in the book
  - **Secondary Methods**:
    - `Set<String> allSpells()`: returns the entire set of spell names
    - `Map<String, Integer> spellsAbove(int powerLevel)`: returns a map of spells
    that are above a minimum power level
  - **Additional Considerations** (*note*: "I don't know" is an acceptable
    answer for each of the following questions):
    - Would this component be mutable? Answer and explain:
      - Yes, my component would be mutable because it is able to add/remove from
      the spell book.
    - Would this component rely on any internal classes (e.g., `Map.Pair`)?
      Answer and explain:
    - Yes, I would need to rely on internal classes like Map.Pair to be able to
    store the name of the spells with the power level associated with it.
    - Would this component need any enums or constants (e.g.,
      `Program.Instruction`)? Answer and explain:
      - No, it would not because I am only using Strings and numbers created by
      the user of the porgram.
    - Can you implement your secondary methods using your kernel methods?
      Answer, explain, and give at least one example:
      - Yes, I would be able to implement my secondary methods with my kernel
      methods because all I need to do is add spells to the spell book and then use that
      for my secondary methods. For example, for the spellsAbove() secondary method,
      all I would need to do is use getPower() to iterate through the power levels
      of the spells and then only return what is above that threshold.

- Component Design #2: BackpackInventory
  - **Description**:
    - This component allows for items to be added, removed, moved, and even
    keeps track of an item's qunatity. It mimics how a game utilizes a backpack
    inventory system. The secondary methods are for more complex actions like
    getting the specific item's quantity, combining the quantity of an item if
    it appears multiple time, and even contains method for the item to see if it
    exists within the backpack.
  - **Kernel Methods**:
    - `void addItem(String item, NaturalNumber quantity)`: adds a given item with
     a quantity to the backpack; Does not combine the quantity of the item with
     other duplicates
    - `void moveItem(int pos, int movedPos)`: Moves the specified item to the
    specific position and combines if it is the same item
    - `String removeItem(int pos)`: removes the item from the given position
    and returns it
    - `int itemsCount()`: reports the number of items in the backpack; Not quantity,
    but how many spaces the items take up in the backpack
  - **Secondary Methods**:
    - `NaturalNumber quantityNumber(String item)`: returns the quantity of the
    specified item throughout the backpack
    - `boolean containsTheItem(String item)`: Checks if the item exists within
    the backpack
    - `void combineItems(String item)`: Combines the quantities of the specific item
    into one space in the backpack
  - **Additional Considerations** (*note*: "I don't know" is an acceptable
    answer for each of the following questions):
    - Would this component be mutable? Answer and explain:
      - Yes, because the component is able to add, remove, and even combine
      the items in the backpack.
    - Would this component rely on any internal classes (e.g., `Map.Pair`)?
      Answer and explain:
      - Yes, I would need to rely on internal classes like Map.Pair to be able to
    store the name of the items and the quantity associated with it.
    - Would this component need any enums or constants (e.g.,
      `Program.Instruction`)? Answer and explain:
      - No, it would not because I am only using Strings and numbers created by
      the user of the porgram.
    - Can you implement your secondary methods using your kernel methods?
      Answer, explain, and give at least one example:
      - Yes, because the secondary methods only need to combine methods like addItem()
      and itemsCount() to make the secondary methods. For example, qunatityNumber()
      could be made with addItem() to loop through the backpack.

- Component Design #3: StopWatch
  - **Description**:
    - This component is made to mirror a stopwatch, but also have the ability
    to rewind and fast forward time(measures in seconds). The purpose is to be able
    to be used in races and just measuring duration with a possibility to fast forward/rewind.
  - **Kernel Methods**:
    - `void starting()`: Starts or continues the stopwatch from its current point
    in seconds
    - `void pause()`: Pauses the time in seconds
    - `void reset()`: Sets the time and laps of time to 0
    - `NaturalNumber theElapsedTime()`: reports the total elapsed time
  - **Secondary Methods**:
    - `void lap()`: Makes the current elapsed time into a lap using a Queue
    - `boolean containsTheItem(String item)`: Checks if the item exists within
    the backpack
    - `boolean isOn()`: Used to make sure that the stopwatch is on; kind of like an
    on/off switch for the stopwatch
  - **Additional Considerations** (*note*: "I don't know" is an acceptable
    answer for each of the following questions):
    - Would this component be mutable? Answer and explain:
      - Yes, because the time can be changed using the kernel methods.
    - Would this component rely on any internal classes (e.g., `Map.Pair`)?
      Answer and explain:
      - I would use a Queue and NaturalNumber if those count as internal
      classes.
    - Would this component need any enums or constants (e.g.,
      `Program.Instruction`)? Answer and explain:
      - I don't know
    - Can you implement your secondary methods using your kernel methods?
      Answer, explain, and give at least one example:
      - Yes, I can use my kernel methods to implement secondary methods like how
      I can implement lap() with elpasedTime() to get the time.

## Post-Assignment

The following sections detail everything that you should do once you've
completed the assignment.

### Changelog

At the end of every assignment, you should update the
[CHANGELOG.md](../../CHANGELOG.md) file found in the root of the project folder.
Since this is likely the first time you've done this, we would recommend
browsing the existing file. It includes all of the changes made to the portfolio
project template. When you're ready, you should delete this file and start your
own. Here's what I would expect to see at the minimum:

```markdown
# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/),
and this project adheres to [Calendar Versioning](https://calver.org/) of
the following form: YYYY.0M.0D.

## YYYY.MM.DD

### Added

- Designed a SpellBook component
- Designed a BackpackInventory component
- Designed a StopWatch component
```

Here `YYYY.MM.DD` would be the date of your submission, such as 2024.04.21.

You may notice that things are nicely linked in the root CHANGELOG. If you'd
like to accomplish that, you will need to make GitHub releases after each pull
request merge (or at least tag your commits). This is not required.

In the future, the CHANGELOG will be used to document changes in your
designs, so we can gauge your progress. Please keep it updated at each stage
of development.

### Submission

If you have completed the assignment using this template, we recommend that
you convert it to a PDF before submission. If you're not sure how, check out
this [Markdown to PDF guide][markdown-to-pdf-guide]. However, PDFs should be
created for you automatically every time you save, so just double check that
all your work is there before submitting. For future assignments, you will
just be submitting a link to a pull request. This will be the only time
you have to submit any PDFs.

### Peer Review

Following the completion of this assignment, you will be assigned three
students' component brainstorming assignments for review. Your job during the
peer review process is to help your peers flesh out their designs. Specifically,
you should be helping them determine which of their designs would be most
practical to complete this semester. When reviewing your peers' assignments,
please treat them with respect. Note also that we can see your comments, which
could help your case if you're looking to become a grader. Ultimately, we
recommend using the following feedback rubric to ensure that your feedback is
both helpful and respectful (you may want to render the markdown as HTML or a
PDF to read this rubric as a table).

| Criteria of Constructive Feedback | Missing                                                                                                                           | Developing                                                                                                                                                                                                                                | Meeting                                                                                                                                                               |
| --------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Specific                          | All feedback is general (not specific)                                                                                            | Some (but not all) feedback is specific and some examples may be provided.                                                                                                                                                                | All feedback is specific, with examples provided where possible                                                                                                       |
| Actionable                        | None of the feedback provides actionable items or suggestions for improvement                                                     | Some feedback provides suggestions for improvement, while some do not                                                                                                                                                                     | All (or nearly all) feedback is actionable; most criticisms are followed by suggestions for improvement                                                               |
| Prioritized                       | Feedback provides only major or minor concerns, but not both. Major and minar concerns are not labeled or feedback is unorganized | Feedback provides both major and minor concerns, but it is not clear which is which and/or the feedback is not as well organized as it could be                                                                                           | Feedback clearly labels major and minor concerns. Feedback is organized in a way that allows the reader to easily understand which points to prioritize in a revision |
| Balanced                          | Feedback describes either strengths or areas of improvement, but not both                                                         | Feedback describes both strengths and areas for improvement, but it is more heavily weighted towards one or the other, and/or descusses both but does not clearly identify which part of the feedback is a strength/area for improvement  | Feedback provides balanced discussion of the document's strengths and areas for improvement. It is clear which piece of feedback is which                             |
| Tactful                           | Overall tone and language are not appropriate (e.g., not considerate, could be interpreted as personal criticism or attack)       | Overall feedback tone and language are general positive, tactul, and non-threatening, but one or more feedback comments could be interpretted as not tactful and/or feedback leans toward personal criticism, not focused on the document | Feedback tone and language are positive, tactful, and non-threatening. Feedback addesses the document, not the writer                                                 |

### Assignment Feedback

If you'd like to give feedback for this assignment (or any assignment, really),
make use of [this survey][survey]. Your feedback helps make assignments
better for future students.

[example-components]: https://therenegadecoder.com/code/the-never-ending-list-of-small-programming-project-ideas/
[markdown-to-pdf-guide]: https://therenegadecoder.com/blog/how-to-convert-markdown-to-a-pdf-3-quick-solutions/
[survey]: https://forms.gle/dumXHo6A4Enucdkq9
