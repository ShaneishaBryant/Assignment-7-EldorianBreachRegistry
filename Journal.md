# Journal
Why is it a good idea to create a shared Creature superclass rather than building separate, unrelated classes for each individual monster from scratch?

Creating a shared superclass promotes code reusability and enables centralized management by grouping related objects under a single type. Subclasses inherit baseline attributes and behaviors while retaining the flexibility to override specific methods without breaking the system. When new entities are added, the existing codebase accommodates them automatically without requiring refactoring.




_____________



Describe the “IS-A” relationship between one of your subclasses and the Creature base class. How does inheritance help reduce duplicate code across the different creature classes?

The "IS-A" relationship dictates that a Dragon IS-A Creature, meaning it automatically inherits all shared state and behavior from the Creature superclass. Inheritance eliminates code duplication, centralizes core attributes, and enables unified processing through polymorphism. Without it, every creature type would have to be written as a completely standalone class, repeating fundamental attributes like name and threatLevel.




____________
Explain how polymorphism allows you to treat different types of objects uniformly in a single loop. Why would adding a brand-new creature type later not require changes to your looping code?

Polymorphism allows you to invoke superclass methods on any array element without needing to know its specific subclass type upfront. 

Adding a new creature type later requires zero changes to the loop because the code depends on the general superclass rather than concrete subclasses—allowing you to extend the system without modifying or recompiling existing iteration logic.