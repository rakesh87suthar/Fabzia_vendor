<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
<script type="text/javascript" src="https://fullcalendar.io/js/fullcalendar-3.0.0/lib/moment.min.js"></script>
<script type="text/javascript" src="https://fullcalendar.io/js/fullcalendar-3.0.0/fullcalendar.min.js"></script>
 <link rel="stylesheet" href="https://fullcalendar.io/js/fullcalendar-3.0.0/fullcalendar.css" type="text/css">

<script type="text/javascript">
$(document).ready(function() {
    $('#calendar').fullCalendar({
      header: {
				left: 'prev,next today',
				center: 'title', 
				right: 'agendaWeek'
			},
      select: function(start, end) {
				var eventData = {
						start: start,
						end: end
					};
					$('#calendar').fullCalendar('renderEvent', eventData, true);
			},
      slotDuration: '0:30',
      defaultView: 'agendaWeek',
      selectable: true,
			selectHelper: true,
      editable: true,
			eventLimit: true,
      slotEventOverlap: false,
      eventOverlap: false,
      minTime: '8:00:00',
      maxTime: '21:00:00',
      allDaySlot: false
    });
});
</script>

</head>
<body>

<div id='calendar'>


</div>
</body>


</html>