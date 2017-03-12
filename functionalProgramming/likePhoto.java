public int likePhoto(int currentLikes, String comment, boolean like) {
	System.out.println("Feedback: " + comment );
	if(like) {
		// increase number of likes by 1
		currentLikes = currentLikes + 1;
	}
	System.out.println("Number of likes: " + currentLikes);
}

public static void main(String args[]) {
	likePhoto(5, "too good.", true);
}
// ex. functioName(args1, arg2);

/*
1) a return type - void

2) a return statement
*/