----------------------------------------------------------
------- Base de données Utilisée pour FlashMarket --------
----------------------------------------------------------

---
-- SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
-- START TRANSACTION;
-- SET time_zone = "+00:00";
---

-- --------------------------------------------------------
--
-- Nétoyage de zone avant le commencement
--
DROP DATABASE IF EXISTS FlashMarket;

-- --------------------------------------------------------
--
-- Base de données : `FlashMarket`
--

CREATE DATABASE IF NOT EXISTS FlashMarket;

--
-- Utilisation de la base de données
--

USE FlashMarket;

-- --------------------------------------------------------

--
-- Structure de la table `CaracteristiquesJ`
--

CREATE TABLE `CaracteristiquesJ` (
  `idCaracteristique` int(11) NOT NULL,
  `idCategorie` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `CaracteristiquesJ`
--

INSERT INTO `CaracteristiquesJ` (`idCaracteristique`, `idCategorie`) VALUES
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5),
(6, 6);

-- --------------------------------------------------------

--
-- Structure de la table `CategorieJ`
--

CREATE TABLE `CategorieJ` (
  `idCategorie` int(11) NOT NULL,
  `nomCategorie` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `CategorieJ`
--

INSERT INTO `CategorieJ` (`idCategorie`, `nomCategorie`) VALUES
(1, 'Téléphones'),
(2, 'Ordinateurs'),
(3, 'Maison'),
(4, 'Terrin'),
(5, 'Habits'),
(6, 'Fruits');

-- --------------------------------------------------------

--
-- Structure de la table `C_FruitsJ`
--

CREATE TABLE `C_FruitsJ` (
  `idF` int(11) NOT NULL,
  `typeF` varchar(40) NOT NULL,
  `idCaracter` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `C_FruitsJ`
--

INSERT INTO `C_FruitsJ` (`idF`, `typeF`, `idCaracter`) VALUES
(1, 'Banane', 6),
(2, 'Ananas', 6),
(3, 'Mangue', 6),
(4, 'Tomate', 6),
(5, 'Orange', 6),
(6, 'Avocat', 6);

-- --------------------------------------------------------

--
-- Structure de la table `C_HabitsJ`
--

CREATE TABLE `C_HabitsJ` (
  `idH` int(11) NOT NULL,
  `typeH` varchar(30) NOT NULL,
  `couleurH` varchar(30) NOT NULL,
  `tailleH` float NOT NULL,
  `idCaracter` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `C_HabitsJ`
--

INSERT INTO `C_HabitsJ` (`idH`, `typeH`, `couleurH`, `tailleH`, `idCaracter`) VALUES
(1, 'Veste', 'Maron', 40, 5),
(2, 'Veste', 'Noir', 42, 5),
(3, 'T-chort', 'Gris', 47, 5),
(4, 'Chemise', 'Blanc', 35, 5);

-- --------------------------------------------------------

--
-- Structure de la table `C_MaisonJ`
--

CREATE TABLE `C_MaisonJ` (
  `idM` int(11) NOT NULL,
  `localiteM` varchar(30) NOT NULL,
  `NiveauM` int(11) NOT NULL,
  `NbrChambreM` int(11) NOT NULL,
  `nbrSalonM` int(11) NOT NULL,
  `nbrCuisineM` int(11) NOT NULL,
  `nbrDoucheM` int(11) NOT NULL,
  `idCaracter` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `C_MaisonJ`
--

INSERT INTO `C_MaisonJ` (`idM`, `localiteM`, `NiveauM`, `NbrChambreM`, `nbrSalonM`, `nbrCuisineM`, `nbrDoucheM`, `idCaracter`) VALUES
(1, 'Cité U', 1, 6, 2, 2, 2, 3),
(2, 'Biyem-assi', 3, 8, 4, 2, 4, 3),
(3, 'SOA', 0, 4, 0, 4, 1, 3),
(4, 'SOA', 2, 13, 4, 10, 13, 3);

-- --------------------------------------------------------

--
-- Structure de la table `C_OrdinateurJ`
--

CREATE TABLE `C_OrdinateurJ` (
  `id_PC` int(11) NOT NULL,
  `ramPC` int(11) NOT NULL,
  `stockagePC` int(11) NOT NULL,
  `typeDisquePC` varchar(30) NOT NULL,
  `marquePC` varchar(30) NOT NULL,
  `TailleEcransPC` float NOT NULL,
  `etatPC` varchar(10) NOT NULL,
  `idCaracter` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `C_OrdinateurJ`
--

INSERT INTO `C_OrdinateurJ` (`id_PC`, `ramPC`, `stockagePC`, `typeDisquePC`, `marquePC`, `TailleEcransPC`, `etatPC`, `idCaracter`) VALUES
(1, 4, 512, 'SSD', 'HP', 2000, 'Occasion', 2),
(2, 8, 512, 'SSD', 'Dell', 1090, 'Occasion', 2),
(3, 6, 512, 'HDD', 'HP', 900, 'Neuf', 2),
(4, 12, 512, 'HDD', 'Accer', 1070, 'Occasion', 2),
(5, 4, 512, 'HDD', 'HP', 2000, 'Occasion', 2);

-- --------------------------------------------------------

--
-- Structure de la table `C_TelephoneJ`
--

CREATE TABLE `C_TelephoneJ` (
  `idTel` int(11) NOT NULL,
  `ramTel` int(11) NOT NULL,
  `stockageTel` int(11) NOT NULL,
  `marqueTel` varchar(30) NOT NULL,
  `etatTel` varchar(10) NOT NULL,
  `idCaracter` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `C_TelephoneJ`
--

INSERT INTO `C_TelephoneJ` (`idTel`, `ramTel`, `stockageTel`, `marqueTel`, `etatTel`, `idCaracter`) VALUES
(1, 4, 32, 'Samsung S6', 'Occasion', 1),
(2, 6, 64, 'Iphone', 'Occasion', 1),
(5, 6, 128, 'Huawi', 'Neuf', 1),
(6, 4, 32, 'Tecno', 'Occasion', 1);

-- --------------------------------------------------------

--
-- Structure de la table `C_TerrainJ`
--

CREATE TABLE `C_TerrainJ` (
  `idTerr` int(11) NOT NULL,
  `localitTerr` varchar(30) NOT NULL,
  `dimentionTerr` float NOT NULL,
  `idCategorie` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `ImagesProduitsJ`
--

CREATE TABLE `ImagesProduitsJ` (
  `idImage` int(11) NOT NULL,
  `tailleImage` float NOT NULL,
  `image` longblob NOT NULL,
  `idProduit` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `ProduitsJ`
--

CREATE TABLE `ProduitsJ` (
  `idProduit` int(11) NOT NULL,
  `nomProduit` varchar(30) NOT NULL,
  `prixProduit` float NOT NULL,
  `descriptionProduit` text NOT NULL,
  `idUser` int(11) NOT NULL,
  `idCategorie` int(11) NOT NULL,
  `idCaracteristique` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `usersJ`
--

CREATE TABLE `usersJ` (
  `id` int(11) NOT NULL,
  `username` varchar(20) NOT NULL,
  `lastName` varchar(20) NOT NULL,
  `password` varchar(50) NOT NULL,
  `phone` varchar(11) NOT NULL,
  `email` varchar(40) NOT NULL,
  `location` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `usersJ`
--

INSERT INTO `usersJ` (`id`, `username`, `lastName`, `password`, `phone`, `email`, `location`) VALUES
(1, 'Adrian', 'Fokkou', '1234', '+23712', 'adrian.fokou@yahoo.com', '123'),
(2, 'Kanzé', 'Djiob', '4321', '+23786', 'kanze.djob@gmail.com', 'Melegne'),
(3, 'Ali', 'Haroune', '51423', '+235675', 'ali.haroune@yahoo.com', 'Farcha'),
(4, 'Saleh', 'Oumar', '2231', '00256', 'saleh@oumar', 'Yaoundé');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `CaracteristiquesJ`
--
ALTER TABLE `CaracteristiquesJ`
  ADD PRIMARY KEY (`idCaracteristique`),
  ADD KEY `FK_Produit_Caracteristique` (`idCategorie`);

--
-- Index pour la table `CategorieJ`
--
ALTER TABLE `CategorieJ`
  ADD PRIMARY KEY (`idCategorie`);

--
-- Index pour la table `C_FruitsJ`
--
ALTER TABLE `C_FruitsJ`
  ADD PRIMARY KEY (`idF`),
  ADD KEY `FK_Fruits_Caracter` (`idCaracter`);

--
-- Index pour la table `C_HabitsJ`
--
ALTER TABLE `C_HabitsJ`
  ADD PRIMARY KEY (`idH`),
  ADD KEY `FK_Habit_Caracter` (`idCaracter`);

--
-- Index pour la table `C_MaisonJ`
--
ALTER TABLE `C_MaisonJ`
  ADD PRIMARY KEY (`idM`),
  ADD KEY `FK_Maison_Caracter` (`idCaracter`);

--
-- Index pour la table `C_OrdinateurJ`
--
ALTER TABLE `C_OrdinateurJ`
  ADD PRIMARY KEY (`id_PC`),
  ADD KEY `FK_Ordinateur_Caracter` (`idCaracter`);

--
-- Index pour la table `C_TelephoneJ`
--
ALTER TABLE `C_TelephoneJ`
  ADD PRIMARY KEY (`idTel`),
  ADD KEY `FK_Tel_Caracter` (`idCaracter`);

--
-- Index pour la table `C_TerrainJ`
--
ALTER TABLE `C_TerrainJ`
  ADD PRIMARY KEY (`idTerr`),
  ADD KEY `FK_Terrin_Categorie` (`idCategorie`);

--
-- Index pour la table `ImagesProduitsJ`
--
ALTER TABLE `ImagesProduitsJ`
  ADD PRIMARY KEY (`idImage`),
  ADD KEY `FK_Images_Produit` (`idProduit`);

--
-- Index pour la table `ProduitsJ`
--
ALTER TABLE `ProduitsJ`
  ADD PRIMARY KEY (`idProduit`),
  ADD KEY `FK_Produit_User` (`idUser`),
  ADD KEY `FK_Produit_Categorie` (`idCategorie`);

--
-- Index pour la table `usersJ`
--
ALTER TABLE `usersJ`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `CaracteristiquesJ`
--
ALTER TABLE `CaracteristiquesJ`
  MODIFY `idCaracteristique` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT pour la table `CategorieJ`
--
ALTER TABLE `CategorieJ`
  MODIFY `idCategorie` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT pour la table `C_FruitsJ`
--
ALTER TABLE `C_FruitsJ`
  MODIFY `idF` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT pour la table `C_HabitsJ`
--
ALTER TABLE `C_HabitsJ`
  MODIFY `idH` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT pour la table `C_MaisonJ`
--
ALTER TABLE `C_MaisonJ`
  MODIFY `idM` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT pour la table `C_Ordinateur`
--
ALTER TABLE `C_OrdinateurJ`
  MODIFY `id_PC` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT pour la table `C_TelephoneJ`
--
ALTER TABLE `C_TelephoneJ`
  MODIFY `idTel` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT pour la table `C_TerrainJ`
--
ALTER TABLE `C_TerrainJ`
  MODIFY `idTerr` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `ImagesProduitsJ`
--
ALTER TABLE `ImagesProduitsJ`
  MODIFY `idImage` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `usersJ`
--
ALTER TABLE `usersJ`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `CaracteristiquesJ`
--
ALTER TABLE `CaracteristiquesJ`
  ADD CONSTRAINT `FK_Produit_Caracteristique` FOREIGN KEY (`idCategorie`) REFERENCES `CategorieJ` (`idCategorie`);

--
-- Contraintes pour la table `C_FruitsJ`
--
ALTER TABLE `C_FruitsJ`
  ADD CONSTRAINT `FK_Fruits_Caracter` FOREIGN KEY (`idCaracter`) REFERENCES `CaracteristiquesJ` (`idCaracteristique`);

--
-- Contraintes pour la table `C_HabitsJ`
--
ALTER TABLE `C_HabitsJ`
  ADD CONSTRAINT `FK_Habit_Caracter` FOREIGN KEY (`idCaracter`) REFERENCES `CaracteristiquesJ` (`idCaracteristique`);

--
-- Contraintes pour la table `C_MaisonJ`
--
ALTER TABLE `C_MaisonJ`
  ADD CONSTRAINT `FK_Maison_Caracter` FOREIGN KEY (`idCaracter`) REFERENCES `CaracteristiquesJ` (`idCaracteristique`);

--
-- Contraintes pour la table `C_OrdinateurJ`
--
ALTER TABLE `C_OrdinateurJ`
  ADD CONSTRAINT `FK_Ordinateur_Caracter` FOREIGN KEY (`idCaracter`) REFERENCES `CaracteristiquesJ` (`idCaracteristique`);

--
-- Contraintes pour la table `C_TelephoneJ`
--
ALTER TABLE `C_TelephoneJ`
  ADD CONSTRAINT `FK_Tel_Caracter` FOREIGN KEY (`idCaracter`) REFERENCES `CaracteristiquesJ` (`idCaracteristique`);

--
-- Contraintes pour la table `C_TerrainJ`
--
ALTER TABLE `C_TerrainJ`
  ADD CONSTRAINT `FK_Terrin_Categorie` FOREIGN KEY (`idCategorie`) REFERENCES `CategorieJ` (`idCategorie`);

--
-- Contraintes pour la table `ImagesProduitsJ`
--
ALTER TABLE `ImagesProduitsJ`
  ADD CONSTRAINT `FK_Images_Produit` FOREIGN KEY (`idProduit`) REFERENCES `ImagesProduitsJ` (`idImage`);

--
-- Contraintes pour la table `ProduitsJ`
--
ALTER TABLE `ProduitsJ`
  ADD CONSTRAINT `FK_Produit_Categorie` FOREIGN KEY (`idCategorie`) REFERENCES `CategorieJ` (`idCategorie`),
  ADD CONSTRAINT `FK_Produit_User` FOREIGN KEY (`idUser`) REFERENCES `usersJ` (`id`);
COMMIT;
