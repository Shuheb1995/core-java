<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UserView</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">

<style>
* {
	margin: 0;
	padding: 0;
}

body {
    background-color: rgb(105, 162, 167);
	font-family: Arial, sans-serif;
}

header {
	background-color: #333;
	color: white;
	padding: 15px;
	text-align: right;
}

footer {
	background-color: #333;
	color: white;
	padding: 10px;
	text-align: center;
    position: fixed; 
	width: 100%;
	bottom: 0;
}

.header-home {
	padding: 10px;
	background-color: #007BFF;
	color: white;
	border: none;
	border-radius: 5px;
	cursor: pointer;
}
.card{
    width: 400px;
	border: groove;
	padding: 50px;
	margin: 20px;
}
</style>
</head>
<body>

<header>
		<a class="header-home" href="UserSign.jsp">Logout</a>
	</header>


	<div class="container mt-5">
		<form id="land-records-form" action="viewUser" method="get">
			<div class="row">
				<div class="col-md-2">

					<label for="state">State:</label> <select class="form-control"
						id="state" name="state"
						onchange="populateDistrict(this.id,'district')" required>
						<option value="">Select State</option>
						<option value="karnataka">Karnataka</option>
					</select>
				</div>


				<div class="col-md-2">
					<label for="district">District:</label> <select
						class="form-control" id="district" name="district"
						onchange="populateTaluk(this.id,'taluk')" required></select>
				</div>

				<div class="col-md-2">
					<label for="taluk">Taluk:</label> <select class="form-control"
						id="taluk" name="taluk" onchange="populateHobli(this.id,'hobli')"
						required></select>
				</div>



				<div class="col-md-2">
					<label for="hobli">Hobli:</label> <select class="form-control"
						id="hobli" name="hobli"
						onchange="populateVillage(this.id,'village')" required></select>
				</div>

				<div class="col-md-2">
					<label for="village">Village:</label> <select class="form-control"
						id="village" name="village" required></select>
				</div>

				<div class="col-md-2">
					<button type="submit" class="btn btn-primary">Records</button>
				</div>

			</div>
		</form>
	</div>
	
	<div class="container mt-5">
		<form id="land-records-form" action="userCard" method="post">
			<div class="row">
				
				<div class="col-md-3">
					<label for="surveyNumber">Survey Number:</label> 
					<select class="form-control" id="surveyNumber" name="surveyNumber">
						<option value="">Select Survey Number</option>
	                    <c:forEach var="list" items="${view}">
	                    <option value="${list.surveyNumber}">${list.surveyNumber}</option>
	                    </c:forEach>
					</select>
				</div>

                <div class="col-md-3">
				<label for="hissaNumber">Hissa Number:</label> 
				<select class="form-control" id="hissaNumber" name="hissaNumber">
						<option value="">Select Hissa Number</option>
	                    <c:forEach var="list" items="${view}">
	                    <option value="${list.hissaNumber}">${list.hissaNumber}</option>
	                    </c:forEach>
					</select>
				</div>
				
				<div class="col-md-3">
					<button type="submit" class="btn btn-primary">Records</button>
				</div>
				
			</div>
		</form>
	</div>
	
	<br>
	<center>
	<div class = "card"><h4><b>Land Owner Details :</b></h4>
	<h5>Owner Name : ${read.ownerName}</h5>
	<h5>Mobile Number : ${read.mobileNumber}</h5>
	<h5>Aadhaar Number : ${read.aadhaarNumber}</h5>
	<h5>Year : ${read.year}</h5>
	</div>
	</center>
	</br>
	
	

	
	<footer> &copy;2023 shuheb.xworkz@gmail.com </footer>
	
	 <script type="text/javascript">
        function populateDistrict(state, district) {
            var s1 = document.getElementById(state);
            var s2 = document.getElementById(district);
    
            s2.innerHTML = "";  // Clear previous options
    
            var districtArray = [];
            if (s1.value == "karnataka") {
                districtArray = ['--selectDistrict|--Select District--', 'Hassan|Hassan', 'Mysore|Mysore', 'Chikkamagaluru|Chikkamagaluru','Shivamogga|Shivamogga','Tumkur|Tumkur'];
            }     
            for (var i = 0; i < districtArray.length; i++) {
                var option = districtArray[i].split("|");
                var newOption = document.createElement("option");
                newOption.value = option[0];
                newOption.text = option[1];
                s2.appendChild(newOption);
            }
        }
    
        function populateTaluk(district, taluk) {
            var s1 = document.getElementById(district);
            var s2 = document.getElementById(taluk);
    
            s2.innerHTML = "";  // Clear previous options
    
            var talukArray = [];
            if (s1.value == "Hassan") {
                talukArray = ['--selectTaluk|--Select Taluk--', 'Sakaleshpur|Sakaleshpur', 'Holenarsipur|Holenarsipur', 'Chennarayapattana|Chennarayapattana', 'Arasikere|Arasikere'];
            } else if (s1.value == "Mysore") {
                talukArray = ['selectTaluk|--Select Taluk--', 'Piriyapatna|Piriyapatna', 'Hunsur|Hunsur', 'Krishnarajanagara|Krishnarajanagara', 'Nanjangud|Nanjangud'];
            } else if (s1.value == "Chikkamagaluru") {
                talukArray = ['selectTaluk|--Select Taluk--', 'Kadur|Kadur', 'Koppa|Koppa', 'Mudigere|Mudigere', 'Tarikere|Tarikere'];
            }else if (s1.value == "Shivamogga") {
                talukArray = ['selectTaluk|--Select Taluk--', 'Bhadravathi|Bhadravathi', 'Tirthahalli|Tirthahalli', 'Sagara|Sagara', 'Shikaripura|Shikaripura'];
            }else if (s1.value == "Tumkur") {
                talukArray = ['selectTaluk|--Select Taluk--', 'Turuvakere|Turuvakere', 'Kunigal|Kunigal', 'Tiptur|Tiptur', 'Madhugiri|Madhugiri'];
            }
            for (var i = 0; i < talukArray.length; i++) {
                var option = talukArray[i].split("|");
                var newOption = document.createElement("option");
                newOption.value = option[0];
                newOption.text = option[1];
                s2.appendChild(newOption);
            }
        }
        function populateHobli(taluk, hobli) {
            var s1 = document.getElementById(taluk);
            var s2 = document.getElementById(hobli);
    
            s2.innerHTML = "";
    
            var hobliArray = [];
            if (s1.value == "Sakaleshpur") {
                hobliArray = ['--selectHobli|--Select Hobli--', 'Belagodu|Belagodu', 'Hanubal|Hanubal'];
            } else if (s1.value == "Holenarsipur") {
                hobliArray = ['--selectHobli|--Select Hobli--', 'Halekote|HaleKote', 'HalliMysore|HalliMysore',];
            } else if (s1.value == "Chennarayapattana") {
                hobliArray = ['--selectHobli|--Select Hobli--', 'Hirisave|Hirisave', 'Shravanabelagola|Shravanabelagola'];
            }else if (s1.value == "Arasikere") {
                hobliArray = ['--selectHobli|--Select Hobli--', 'Banavara|Banavara','Javagal|Javagal'];
            }else if (s1.value == "Piriyapatna") {
                hobliArray = ['--selectHobli|--Select Hobli--', 'Bettadapura|Bettadapura','Haranahalli|Haranahalli'];
            }else if (s1.value == "Hunsur") {
                hobliArray = ['--selectHobli|--Select Hobli--', 'Bilikere|Bilikere','Hanagodu|Hanagodu'];
            }else if (s1.value == "Krishnarajanagara") {
                hobliArray = ['--selectHobli|--Select Hobli--', 'Hebbalu|Hebbalu','Hosagrahara|Hosagrahara'];
            }else if (s1.value == "Nanjangud") {
                hobliArray = ['--selectHobli|--Select Hobli--', 'Biligere|Biligere','Hullahalli|Hullahalli'];
            }else if (s1.value == "Kadur") {
                hobliArray = ['--selectHobli|--Select Hobli--','Beeruru|Beeruru', 'Yagati|Yagati'];
            }else if (s1.value == "Koppa") {
                hobliArray = ['--selectHobli|--Select Hobli--', 'Hariharapura|Hariharapura','Megunda|Megunda'];
            }else if (s1.value == "Mudigere") {
                hobliArray = ['--selectHobli|--Select Hobli--', 'Baluru|Baluru','Banakal|Banakal'];
            }else if (s1.value == "Tarikere") {
                hobliArray = ['--selectHobli|--Select Hobli--', 'Lakkavalli|Lakkavalli','Lingadahalli|Lingadahalli'];
            }else if (s1.value == "Bhadravathi") {
                hobliArray = ['--selectHobli|--Select Hobli--', 'Holehonnuru AI|Holehonnuru AI','Kudligere|Kudligere'];
            }else if (s1.value == "Tirthahalli") {
                hobliArray = ['--selectHobli|--Select Hobli--', 'Agrahara|Agrahara','Agumbe|Agumbe'];
            }else if (s1.value == "Sagara") {
                hobliArray = ['--selectHobli|--Select Hobli--', 'Anandapura|Anandapura','Talaguppa|Talaguppa'];
            }else if (s1.value == "Shikaripura") {
                hobliArray = ['--selectHobli|--Select Hobli--', 'Anjanapura|Anjanapura','Hosuru|Hosuru'];
            }else if (s1.value == "Turuvakere") {
                hobliArray = ['--selectHobli|--Select Hobli--', 'Dabbeghatta|Dabbeghatta','Mayasandra|Mayasandra'];
            }else if (s1.value == "Kunigal") {
                hobliArray = ['--selectHobli|--Select Hobli--', 'Amrutturu|Amrutturu','Kottagere|Kottagere'];
            }else if (s1.value == "Tiptur") {
                hobliArray = ['--selectHobli|--Select Hobli--', 'Honavalli|Honavalli','Kibbanahalli|Kibbanahalli'];
            }else if (s1.value == "Madhugiri") {
                hobliArray = ['--selectHobli|--Select Hobli--', 'Dodderi|Dodderi','Midigeshi|Midigeshi'];
            }
    
            for (var i = 0; i < hobliArray.length; i++) {
                var option = hobliArray[i].split("|");
                var newOption = document.createElement("option");
                newOption.value = option[0];
                newOption.text = option[1];
                s2.appendChild(newOption);
            }
        }
        function populateVillage(hobli, village) {
            var s1 = document.getElementById(hobli);
            var s2 = document.getElementById(village);
    
            s2.innerHTML = "";
    
            var villageArray = [];
            if (s1.value == "Belagodu") {
                villageArray = ['--selectVillage|--Select Village--', 'Adaravalli|Adaravalli', 'Balagodu|Balagodu', 'Bhage|Bhage', 'Halekere|Halekere'];
            } else if (s1.value == "Hanubal") {
                villageArray = ['--selectVillage|--Select Village--', 'Agani|Agani', 'Bachanahalli|Bachanahalli', 'Dabbegadde|Dabbegadde' , 'Heggadde|Heggadde'];
            } else if (s1.value == "Halekote") {
                villageArray = ['--selectVillage|--Select Village--', 'Ankanahalli|Ankanahalli', 'Banukuppe|Banukuppe', 'Chandapura|Chandapura', 'Hosahalli|Hosahalli'];
            }else if (s1.value == "HalliMysore") {
                villageArray = ['--selectVillage|--Select Village--', 'Arehalli|Arehalli', 'Bachanahalli|Bachanahalli', 'Cholenahalli|Cholenahalli', 'Kodihalli|Kodihalli'];
            }else if (s1.value == "Hirisave") {
                villageArray = ['--selectVillage|--Select Village--', 'Arakere|Arakere', 'Buka|Buka', 'Channahalli|Channahalli', 'Dasarahalli|Dasarahalli'];
            }else if (s1.value == "Shravanabelagola") {
                villageArray = ['--selectVillage|--Select Village--', 'Aladahalli|Aladahalli', 'Basavanahalli|Basavanahalli', 'Chikkabilati|Chikkabilati', 'Gullenahalli|Gullenahalli'];
            }else if (s1.value == "Banavara") {
                villageArray = ['--selectVillage|--Select Village--', 'Agrahara|Agrahara', 'Bairambudi|Bairambudi', 'Chikkabanavara|Chikkabanavara', 'Ganjigere|Ganjigere'];
            }else if (s1.value == "Javagal") {
                villageArray = ['--selectVillage|--Select Village--', 'Attiguddakaval|Attiguddakaval', 'Beluvalli|Beluvalli', 'Deshani|Deshani', 'Devihalli|Devihalli'];
            }else if (s1.value == "Bettadapura") {
                villageArray = ['--selectVillage|--Select Village--', 'Attiguda|Attiguda', 'Bekkare|Bekkare', 'Billahalli|Billahalli', 'Depura|Depura'];
            }else if (s1.value == "Haranahalli") {
                villageArray = ['--selectVillage|--Select Village--', 'Adaguru|Adaguru', 'Avarti|Avarti', 'Bailakuppe|Bailakuppe', 'Dindugadu|Dindugadu'];
            }else if (s1.value == "Bilikere") {
                villageArray = ['--selectVillage|--Select Village--', 'Ankanahalli|Ankanahalli', 'Bettaduru|Bettaduru', 'Challahalli|Challahalli', 'Devagalli|Devagalli'];
            }else if (s1.value == "Hanagodu") {
                villageArray = ['--selectVillage|--Select Village--', 'Abburu|Abburu', 'Beeranahalli|Beeranahalli', 'Chennasoge|Chennasoge', 'Dasanapura|Dasanapura'];
            }else if (s1.value == "Hebbalu") {
                villageArray = ['--selectVillage|--Select Village--', 'Adaganahalli|Adaganahalli', 'Bhuvanahalli|Bhuvanahalli', 'Bydarahalli|Bydarahalli', 'Katnalu|Katnalu'];
            }else if (s1.value == "Hosagrahara") {
                villageArray = ['--selectVillage|--Select Village--', 'Arjunahalli|Arjunahalli', 'Beeranahalli|Beeranahalli', 'Changa|Changa', 'Hampapura|Hampapura'];
            }else if (s1.value == "Biligere") {
                villageArray = ['--selectVillage|--Select Village--', 'Alamburu|Alamburu', 'Bilugali|Bilugali', 'Gonahalli|Gonahalli', 'Kahalli|Kahalli'];
            }else if (s1.value == "Hullahalli") {
                villageArray = ['--selectVillage|--Select Village--', 'Akala|Akala', 'Belale|Belale', 'Chennapattana|Chennapattana', 'Hadya|Hadya'];
            }else if (s1.value == "Beeruru") {
                villageArray = ['--selectVillage|--Select Village--', 'Bagaytu|Bagaytu', 'Chikkangala|Chikkangala', 'Galeehalli|Galeehalli', 'Hullehalli|Hullehalli'];
            }else if (s1.value == "Yagati") {
                villageArray = ['--selectVillage|--Select Village--', 'Anneegere|Anneegere', 'Bhukanagonndi|Bhukanagonndi', 'Chatnahalli|Chatnahalli', 'Garje|Garje'];
            }else if (s1.value == "Hariharapura") {
                villageArray = ['--selectVillage|--Select Village--', 'Asagodu|Asagodu', 'Bilagadde|Bilagadde', 'Heggaru|Heggaru', 'Hosuru|Hosuru'];
            }else if (s1.value == "Megunda") {
                villageArray = ['--selectVillage|--Select Village--', 'Adigebailu|Adigebailu', 'Attikodige|Attikodige', 'Guddetota|Guddetota', 'Heruru|Heruru'];
            }else if (s1.value == "Baluru") {
                villageArray = ['--selectVillage|--Select Village--', 'Balige|Balige', 'Hadioni|Hadioni', 'Javali|Javali', 'Kuve|Kuve'];
            }else if (s1.value == "Banakal") {
                villageArray = ['--selectVillage|--Select Village--', 'Attigere|Attigere', 'Bakki|Bakki', 'Falguni|Falguni', 'Gutti|Gutti'];
            }else if (s1.value == "Lakkavalli") {
                villageArray = ['--selectVillage|--Select Village--', 'Bhavikere|Bhavikere', 'Gopala|Gopala', 'Halasuru|Halasuru', 'Sompura|Sompura'];
            }else if (s1.value == "Lingadahalli") {
                villageArray = ['--selectVillage|--Select Village--', 'Ballavara|Ballavara', 'Gonguru|Gonguru', 'Kallalu|Kallalu', 'Nandi|Nandi'];
            }else if (s1.value == "Holehonnuru AI") {
                villageArray = ['--selectVillage|--Select Village--', 'Agasanahalli|Agasanahalli', 'Aradotlu|Aradotlu', 'Koppa|Koppa', 'Sidleepura|Sidleepura'];
            }else if (s1.value == "Kudligere") {
                villageArray = ['--selectVillage|--Select Village--', 'Aralihalli|Aralihalli', 'Balekatte|Balekatte', 'Dodderi|Dodderi', 'Ganguru|Ganguru'];
            }else if (s1.value == "Agrahara") {
                villageArray = ['--selectVillage|--Select Village--', 'Agasadi|Agasadi', 'Bandya|Bandya', 'Beede|Beede', 'Hadigallu|Hadigallu'];
            }else if (s1.value == "Agumbe") {
                villageArray = ['--selectVillage|--Select Village--', 'Balehalli|Balehalli', 'Changara|Changara', 'Huruli|Huruli', 'Kunda|Kunda'];
            }else if (s1.value == "Anandapura") {
                villageArray = ['--selectVillage|--Select Village--', 'Achapura|Achapura', 'Aduru|Aduru', 'Bilagodi|Bilagodi', 'Chipli|Chipli'];
            }else if (s1.value == "Talaguppa") {
                villageArray = ['--selectVillage|--Select Village--', 'Arehada|Arehada', 'Bellenne|Bellenne', 'Kanase|Kanase', 'Kelavi|Kelavi'];
            }else if (s1.value == "Anjanapura") {
                villageArray = ['--selectVillage|--Select Village--', 'Attibailu|Attibailu', 'Bhadrapura|Bhadrapura', 'Churchigondi|Churchigondi', 'Eesuru|Eesuru'];
            }else if (s1.value == "Hosuru") {
                villageArray = ['--selectVillage|--Select Village--', 'Baalekoppa|Baalekoppa', 'Beguru|Beguru', 'Chennahalli|Chennahalli', 'Dupadahalli|Dupadahalli'];
            }else if (s1.value == "Dabbeghatta") {
                villageArray = ['--selectVillage|--Select Village--', 'Abalakatte|Abalakatte', 'Benkikere|Benkikere', 'Devihalli|Devihalli', 'Hulikal|Hulikal'];
            }else if (s1.value == "Mayasandra") {
                villageArray = ['--selectVillage|--Select Village--', 'Ajjanahalli|Ajjanahalli', 'Byalahalli|Byalahalli', 'Chikkapura|Chikkapura', 'Daasihalli|Daasihalli'];
            }else if (s1.value == "Amrutturu") {
                villageArray = ['--selectVillage|--Select Village--', 'Arjunahalli|Arjunahalli', 'Bisinele|Bisinele', 'Chinavara|Chinavara', 'Halagere|Halagere'];
            }else if (s1.value == "Kottagere") {
                villageArray = ['--selectVillage|--Select Village--', 'Baagenahalli|Baagenahalli', 'Dasanapura|Dasanapura', 'Gunnagere|Gunnagere', 'Janagere|Janagere'];
            }else if (s1.value == "Honavalli") {
                villageArray = ['--selectVillage|--Select Village--', 'Aluru|Aluru', 'Anivala|Anivala', 'Bairapura|Bairapura', 'Chowlihalli|Chowlihalli'];
            }else if (s1.value == "Kibbanahalli") {
                villageArray = ['--selectVillage|--Select Village--', 'Aralaguppe|Aralaguppe', 'Ballekatte|Ballekatte', 'Biligere|Biligere', 'Hatna|Hatna'];
            }else if (s1.value == "Dodderi") {
                villageArray = ['--selectVillage|--Select Village--', 'Adavikatanahalli|Adavikatanahalli', 'Belladamadu|Belladamadu', 'Borakunte|Borakunte', 'Chandragiri|Chandragiri'];
            }else if (s1.value == "Midigeshi") {
                villageArray = ['--selectVillage|--Select Village--', 'Adavihalli|Adavihalli', 'Bedatturu|Bedatturu', 'Kasapura|Kasapura', 'Neelihalli|Neelihalli'];
            }
            
            
            
            for (var i = 0; i < villageArray.length; i++) {
                var option = villageArray[i].split("|");
                var newOption = document.createElement("option");
                newOption.value = option[0];
                newOption.text = option[1];
                s2.appendChild(newOption);
            }
        }

    </script>
	
</body>
</html>