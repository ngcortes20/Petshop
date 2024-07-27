document.getElementById('commentForm').addEventListener('submit', function(event) {
    event.preventDefault();
    const commentText = document.getElementById('comment').value;
    if (commentText) {
        const commentDisplay = document.getElementById('commentDisplay');
        const newComment = document.createElement('p');
        newComment.textContent = commentText;
        commentDisplay.appendChild(newComment);
        document.getElementById('comment').value = '';
    }
});
