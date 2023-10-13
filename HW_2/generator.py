from random import choice
from abc import ABC, abstractmethod


class ItemFabric(ABC):
    @abstractmethod
    def create_item(self):
        pass

    def open_reward(self):
        self.game_item = self.create_item()
        self.game_item.open()


class IGameItem(ABC):
    @abstractmethod
    def open(self):
        pass


class GoldReward(IGameItem):
    def open(self):
        print('Gold')


class GoldGenerator(ItemFabric):
    def create_item(self):
        print('Created a new chest')
        return GoldReward()


class GemReward(IGameItem):
    def open(self):
        print('Gem')


class GemGenerator(ItemFabric):
    def create_item(self):
        print('Created a new chest')
        return GemReward()
    
    
class PearlReward(IGameItem):
    def open(self):
        print('Pearl')


class PearlGenerator(ItemFabric):
    def create_item(self):
        print('Created a new chest')
        return PearlReward()
    

class DiamondReward(IGameItem):
    def open(self):
        print('Diamond')


class DiamondGenerator(ItemFabric):
    def create_item(self):
        print('Created a new chest')
        return DiamondReward()


if __name__ == '__main__':
    # gold_generator = GoldGenerator()
    # gold_generator.open_reward()
    lst = [GoldGenerator(), GemGenerator(), DiamondGenerator(), PearlGenerator()]
    for i in range(10):
        choice(lst).open_reward()