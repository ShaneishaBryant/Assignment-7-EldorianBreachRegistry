# Journal
Why is it a good idea to create a shared Creature superclass rather than building separate, unrelated classes for each individual monster from scratch?

Creating a shared superclass promotes code reusability and enables centralized management by grouping related objects under a single type. Subclasses inherit baseline attributes and behaviors while retaining the flexibility to override specific methods without breaking the system. When new entities are added, the existing codebase accommodates them automatically without requiring refactoring.

